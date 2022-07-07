package com.example.celestialapp.data.local;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.celestialapp.data.local.entities.CelestialInfoEntity;
import com.example.celestialapp.data.local.entities.CelestialKeywordCrossRef;
import com.example.celestialapp.data.local.entities.CelestialTagCrossRef;
import com.example.celestialapp.data.local.entities.KeywordInfoEntity;
import com.example.celestialapp.data.local.entities.TagInfoEntity;
import com.example.celestialapp.data.local.relations.CelestialWithKeywords;
import com.example.celestialapp.data.local.relations.CelestialWithTags;
import com.example.celestialapp.data.local.relations.TagWithCelestials;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CelestialInfoDao_Impl implements CelestialInfoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CelestialInfoEntity> __insertionAdapterOfCelestialInfoEntity;

  private final EntityInsertionAdapter<TagInfoEntity> __insertionAdapterOfTagInfoEntity;

  private final EntityInsertionAdapter<CelestialTagCrossRef> __insertionAdapterOfCelestialTagCrossRef;

  private final EntityInsertionAdapter<KeywordInfoEntity> __insertionAdapterOfKeywordInfoEntity;

  private final EntityInsertionAdapter<CelestialKeywordCrossRef> __insertionAdapterOfCelestialKeywordCrossRef;

  private final SharedSQLiteStatement __preparedStmtOfUpdateImage;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDateFavouriteCreated;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTag;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTagCrossRef;

  private final SharedSQLiteStatement __preparedStmtOfDeleteCelestialTagsCrossRef;

  public CelestialInfoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCelestialInfoEntity = new EntityInsertionAdapter<CelestialInfoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CelestialInfoEntity` (`celestialId`,`nasa_id`,`title`,`date`,`dateFavouriteCreated`,`description`,`image`,`image_path`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CelestialInfoEntity value) {
        stmt.bindLong(1, value.getCelestialId());
        if (value.getNasaId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNasaId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
        if (value.getDateFavouriteCreated() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getDateFavouriteCreated());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        if (value.getImage() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindBlob(7, value.getImage());
        }
        if (value.getImagePath() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getImagePath());
        }
      }
    };
    this.__insertionAdapterOfTagInfoEntity = new EntityInsertionAdapter<TagInfoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TagInfoEntity` (`tagId`,`name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TagInfoEntity value) {
        stmt.bindLong(1, value.getTagId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__insertionAdapterOfCelestialTagCrossRef = new EntityInsertionAdapter<CelestialTagCrossRef>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CelestialTagCrossRef` (`celestialId`,`tagId`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CelestialTagCrossRef value) {
        stmt.bindLong(1, value.getCelestialId());
        stmt.bindLong(2, value.getTagId());
      }
    };
    this.__insertionAdapterOfKeywordInfoEntity = new EntityInsertionAdapter<KeywordInfoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `KeywordInfoEntity` (`keywordId`,`name`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KeywordInfoEntity value) {
        stmt.bindLong(1, value.getKeywordId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__insertionAdapterOfCelestialKeywordCrossRef = new EntityInsertionAdapter<CelestialKeywordCrossRef>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CelestialKeywordCrossRef` (`celestialId`,`keywordId`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CelestialKeywordCrossRef value) {
        stmt.bindLong(1, value.getCelestialId());
        stmt.bindLong(2, value.getKeywordId());
      }
    };
    this.__preparedStmtOfUpdateImage = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE celestialinfoentity SET image = ? WHERE nasa_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDateFavouriteCreated = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE celestialinfoentity SET dateFavouriteCreated = ? WHERE nasa_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTag = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM taginfoentity WHERE tagId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTagCrossRef = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM celestialtagcrossref WHERE tagId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteCelestialTagsCrossRef = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM celestialtagcrossref WHERE celestialId = ? AND tagId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertCelestial(final CelestialInfoEntity celestialInfoEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCelestialInfoEntity.insert(celestialInfoEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertTag(final TagInfoEntity tagInfoEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTagInfoEntity.insert(tagInfoEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCelestialTagCrossRef(final CelestialTagCrossRef crossRef) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCelestialTagCrossRef.insert(crossRef);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertKeyword(final KeywordInfoEntity keywordInfoEntity) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfKeywordInfoEntity.insert(keywordInfoEntity);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertCelestialKeywordCrossRef(final CelestialKeywordCrossRef crossRef) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCelestialKeywordCrossRef.insert(crossRef);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateImage(final String nasaId, final byte[] image) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateImage.acquire();
    int _argIndex = 1;
    if (image == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindBlob(_argIndex, image);
    }
    _argIndex = 2;
    if (nasaId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, nasaId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateImage.release(_stmt);
    }
  }

  @Override
  public void updateDateFavouriteCreated(final String nasaId, final Long dateFavouriteCreated) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDateFavouriteCreated.acquire();
    int _argIndex = 1;
    if (dateFavouriteCreated == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, dateFavouriteCreated);
    }
    _argIndex = 2;
    if (nasaId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, nasaId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateDateFavouriteCreated.release(_stmt);
    }
  }

  @Override
  public void deleteTag(final int tagId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTag.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, tagId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTag.release(_stmt);
    }
  }

  @Override
  public void deleteTagCrossRef(final int tagId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTagCrossRef.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, tagId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTagCrossRef.release(_stmt);
    }
  }

  @Override
  public void deleteCelestialTagsCrossRef(final int celestialId, final int tagId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteCelestialTagsCrossRef.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, celestialId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, tagId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteCelestialTagsCrossRef.release(_stmt);
    }
  }

  @Override
  public CelestialInfoEntity getCelestialByNasaId(final String nasaId) {
    final String _sql = "SELECT * FROM celestialinfoentity WHERE nasa_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (nasaId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, nasaId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCelestialId = CursorUtil.getColumnIndexOrThrow(_cursor, "celestialId");
      final int _cursorIndexOfNasaId = CursorUtil.getColumnIndexOrThrow(_cursor, "nasa_id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfDateFavouriteCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateFavouriteCreated");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "image_path");
      final CelestialInfoEntity _result;
      if(_cursor.moveToFirst()) {
        final int _tmpCelestialId;
        _tmpCelestialId = _cursor.getInt(_cursorIndexOfCelestialId);
        final String _tmpNasaId;
        if (_cursor.isNull(_cursorIndexOfNasaId)) {
          _tmpNasaId = null;
        } else {
          _tmpNasaId = _cursor.getString(_cursorIndexOfNasaId);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final Long _tmpDateFavouriteCreated;
        if (_cursor.isNull(_cursorIndexOfDateFavouriteCreated)) {
          _tmpDateFavouriteCreated = null;
        } else {
          _tmpDateFavouriteCreated = _cursor.getLong(_cursorIndexOfDateFavouriteCreated);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final byte[] _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        }
        final String _tmpImagePath;
        if (_cursor.isNull(_cursorIndexOfImagePath)) {
          _tmpImagePath = null;
        } else {
          _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
        }
        _result = new CelestialInfoEntity(_tmpCelestialId,_tmpNasaId,_tmpTitle,_tmpDate,_tmpDateFavouriteCreated,_tmpDescription,_tmpImage,_tmpImagePath);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TagInfoEntity> getExclusiveTags(final List<Integer> listTagId) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM taginfoentity WHERE tagId not IN (");
    final int _inputSize = listTagId.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (Integer _item : listTagId) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTagId = CursorUtil.getColumnIndexOrThrow(_cursor, "tagId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final List<TagInfoEntity> _result = new ArrayList<TagInfoEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TagInfoEntity _item_1;
        final int _tmpTagId;
        _tmpTagId = _cursor.getInt(_cursorIndexOfTagId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item_1 = new TagInfoEntity(_tmpTagId,_tmpName);
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TagInfoEntity> getTags() {
    final String _sql = "SELECT * FROM taginfoentity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfTagId = CursorUtil.getColumnIndexOrThrow(_cursor, "tagId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final List<TagInfoEntity> _result = new ArrayList<TagInfoEntity>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TagInfoEntity _item;
        final int _tmpTagId;
        _tmpTagId = _cursor.getInt(_cursorIndexOfTagId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _item = new TagInfoEntity(_tmpTagId,_tmpName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Integer getTagIdByName(final String tagName) {
    final String _sql = "SELECT tagId FROM taginfoentity WHERE name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (tagName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, tagName);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final Integer _result;
      if(_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getInt(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CelestialWithTags> getCelestialWithTags(final List<String> listNasaId) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM celestialinfoentity WHERE nasa_id IN(");
    final int _inputSize = listNasaId.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : listNasaId) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfCelestialId = CursorUtil.getColumnIndexOrThrow(_cursor, "celestialId");
        final int _cursorIndexOfNasaId = CursorUtil.getColumnIndexOrThrow(_cursor, "nasa_id");
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
        final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
        final int _cursorIndexOfDateFavouriteCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateFavouriteCreated");
        final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
        final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
        final int _cursorIndexOfImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "image_path");
        final LongSparseArray<ArrayList<TagInfoEntity>> _collectionTagInfoEntity = new LongSparseArray<ArrayList<TagInfoEntity>>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfCelestialId);
          ArrayList<TagInfoEntity> _tmpTagInfoEntityCollection = _collectionTagInfoEntity.get(_tmpKey);
          if (_tmpTagInfoEntityCollection == null) {
            _tmpTagInfoEntityCollection = new ArrayList<TagInfoEntity>();
            _collectionTagInfoEntity.put(_tmpKey, _tmpTagInfoEntityCollection);
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipTagInfoEntityAscomExampleCelestialappDataLocalEntitiesTagInfoEntity(_collectionTagInfoEntity);
        final List<CelestialWithTags> _result = new ArrayList<CelestialWithTags>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final CelestialWithTags _item_1;
          final CelestialInfoEntity _tmpCelestialInfoEntity;
          if (! (_cursor.isNull(_cursorIndexOfCelestialId) && _cursor.isNull(_cursorIndexOfNasaId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDate) && _cursor.isNull(_cursorIndexOfDateFavouriteCreated) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfImage) && _cursor.isNull(_cursorIndexOfImagePath))) {
            final int _tmpCelestialId;
            _tmpCelestialId = _cursor.getInt(_cursorIndexOfCelestialId);
            final String _tmpNasaId;
            if (_cursor.isNull(_cursorIndexOfNasaId)) {
              _tmpNasaId = null;
            } else {
              _tmpNasaId = _cursor.getString(_cursorIndexOfNasaId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final Long _tmpDateFavouriteCreated;
            if (_cursor.isNull(_cursorIndexOfDateFavouriteCreated)) {
              _tmpDateFavouriteCreated = null;
            } else {
              _tmpDateFavouriteCreated = _cursor.getLong(_cursorIndexOfDateFavouriteCreated);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final byte[] _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
            }
            final String _tmpImagePath;
            if (_cursor.isNull(_cursorIndexOfImagePath)) {
              _tmpImagePath = null;
            } else {
              _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
            }
            _tmpCelestialInfoEntity = new CelestialInfoEntity(_tmpCelestialId,_tmpNasaId,_tmpTitle,_tmpDate,_tmpDateFavouriteCreated,_tmpDescription,_tmpImage,_tmpImagePath);
          }  else  {
            _tmpCelestialInfoEntity = null;
          }
          ArrayList<TagInfoEntity> _tmpTagInfoEntityCollection_1 = null;
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfCelestialId);
          _tmpTagInfoEntityCollection_1 = _collectionTagInfoEntity.get(_tmpKey_1);
          if (_tmpTagInfoEntityCollection_1 == null) {
            _tmpTagInfoEntityCollection_1 = new ArrayList<TagInfoEntity>();
          }
          _item_1 = new CelestialWithTags(_tmpCelestialInfoEntity,_tmpTagInfoEntityCollection_1);
          _result.add(_item_1);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<TagWithCelestials> getTagsByListTagId(final List<Integer> listTagId) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM taginfoentity WHERE tagId IN(");
    final int _inputSize = listTagId.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (Integer _item : listTagId) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfTagId = CursorUtil.getColumnIndexOrThrow(_cursor, "tagId");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
        final LongSparseArray<ArrayList<CelestialInfoEntity>> _collectionCelestialInfoEntity = new LongSparseArray<ArrayList<CelestialInfoEntity>>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfTagId);
          ArrayList<CelestialInfoEntity> _tmpCelestialInfoEntityCollection = _collectionCelestialInfoEntity.get(_tmpKey);
          if (_tmpCelestialInfoEntityCollection == null) {
            _tmpCelestialInfoEntityCollection = new ArrayList<CelestialInfoEntity>();
            _collectionCelestialInfoEntity.put(_tmpKey, _tmpCelestialInfoEntityCollection);
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipCelestialInfoEntityAscomExampleCelestialappDataLocalEntitiesCelestialInfoEntity(_collectionCelestialInfoEntity);
        final List<TagWithCelestials> _result = new ArrayList<TagWithCelestials>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final TagWithCelestials _item_1;
          final TagInfoEntity _tmpTagInfoEntity;
          if (! (_cursor.isNull(_cursorIndexOfTagId) && _cursor.isNull(_cursorIndexOfName))) {
            final int _tmpTagId;
            _tmpTagId = _cursor.getInt(_cursorIndexOfTagId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _tmpTagInfoEntity = new TagInfoEntity(_tmpTagId,_tmpName);
          }  else  {
            _tmpTagInfoEntity = null;
          }
          ArrayList<CelestialInfoEntity> _tmpCelestialInfoEntityCollection_1 = null;
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfTagId);
          _tmpCelestialInfoEntityCollection_1 = _collectionCelestialInfoEntity.get(_tmpKey_1);
          if (_tmpCelestialInfoEntityCollection_1 == null) {
            _tmpCelestialInfoEntityCollection_1 = new ArrayList<CelestialInfoEntity>();
          }
          _item_1 = new TagWithCelestials(_tmpTagInfoEntity,_tmpCelestialInfoEntityCollection_1);
          _result.add(_item_1);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<CelestialWithKeywords> getKeywordsByNasaId(final String nasaId) {
    final String _sql = "SELECT * FROM celestialinfoentity WHERE nasa_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (nasaId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, nasaId);
    }
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfCelestialId = CursorUtil.getColumnIndexOrThrow(_cursor, "celestialId");
        final int _cursorIndexOfNasaId = CursorUtil.getColumnIndexOrThrow(_cursor, "nasa_id");
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
        final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
        final int _cursorIndexOfDateFavouriteCreated = CursorUtil.getColumnIndexOrThrow(_cursor, "dateFavouriteCreated");
        final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
        final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
        final int _cursorIndexOfImagePath = CursorUtil.getColumnIndexOrThrow(_cursor, "image_path");
        final LongSparseArray<ArrayList<KeywordInfoEntity>> _collectionKeywordInfoEntity = new LongSparseArray<ArrayList<KeywordInfoEntity>>();
        while (_cursor.moveToNext()) {
          final long _tmpKey = _cursor.getLong(_cursorIndexOfCelestialId);
          ArrayList<KeywordInfoEntity> _tmpKeywordInfoEntityCollection = _collectionKeywordInfoEntity.get(_tmpKey);
          if (_tmpKeywordInfoEntityCollection == null) {
            _tmpKeywordInfoEntityCollection = new ArrayList<KeywordInfoEntity>();
            _collectionKeywordInfoEntity.put(_tmpKey, _tmpKeywordInfoEntityCollection);
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipKeywordInfoEntityAscomExampleCelestialappDataLocalEntitiesKeywordInfoEntity(_collectionKeywordInfoEntity);
        final List<CelestialWithKeywords> _result = new ArrayList<CelestialWithKeywords>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final CelestialWithKeywords _item;
          final CelestialInfoEntity _tmpCelestialInfoEntity;
          if (! (_cursor.isNull(_cursorIndexOfCelestialId) && _cursor.isNull(_cursorIndexOfNasaId) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDate) && _cursor.isNull(_cursorIndexOfDateFavouriteCreated) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfImage) && _cursor.isNull(_cursorIndexOfImagePath))) {
            final int _tmpCelestialId;
            _tmpCelestialId = _cursor.getInt(_cursorIndexOfCelestialId);
            final String _tmpNasaId;
            if (_cursor.isNull(_cursorIndexOfNasaId)) {
              _tmpNasaId = null;
            } else {
              _tmpNasaId = _cursor.getString(_cursorIndexOfNasaId);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final Long _tmpDateFavouriteCreated;
            if (_cursor.isNull(_cursorIndexOfDateFavouriteCreated)) {
              _tmpDateFavouriteCreated = null;
            } else {
              _tmpDateFavouriteCreated = _cursor.getLong(_cursorIndexOfDateFavouriteCreated);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final byte[] _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
            }
            final String _tmpImagePath;
            if (_cursor.isNull(_cursorIndexOfImagePath)) {
              _tmpImagePath = null;
            } else {
              _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
            }
            _tmpCelestialInfoEntity = new CelestialInfoEntity(_tmpCelestialId,_tmpNasaId,_tmpTitle,_tmpDate,_tmpDateFavouriteCreated,_tmpDescription,_tmpImage,_tmpImagePath);
          }  else  {
            _tmpCelestialInfoEntity = null;
          }
          ArrayList<KeywordInfoEntity> _tmpKeywordInfoEntityCollection_1 = null;
          final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfCelestialId);
          _tmpKeywordInfoEntityCollection_1 = _collectionKeywordInfoEntity.get(_tmpKey_1);
          if (_tmpKeywordInfoEntityCollection_1 == null) {
            _tmpKeywordInfoEntityCollection_1 = new ArrayList<KeywordInfoEntity>();
          }
          _item = new CelestialWithKeywords(_tmpCelestialInfoEntity,_tmpKeywordInfoEntityCollection_1);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public KeywordInfoEntity getKeywordByName(final String keywordName) {
    final String _sql = "SELECT * FROM keywordinfoentity WHERE name = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (keywordName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, keywordName);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfKeywordId = CursorUtil.getColumnIndexOrThrow(_cursor, "keywordId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final KeywordInfoEntity _result;
      if(_cursor.moveToFirst()) {
        final int _tmpKeywordId;
        _tmpKeywordId = _cursor.getInt(_cursorIndexOfKeywordId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        _result = new KeywordInfoEntity(_tmpKeywordId,_tmpName);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Long getFavouriteDate(final String nasaId) {
    final String _sql = "SELECT dateFavouriteCreated FROM celestialinfoentity WHERE nasa_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (nasaId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, nasaId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final Long _result;
      if(_cursor.moveToFirst()) {
        if (_cursor.isNull(0)) {
          _result = null;
        } else {
          _result = _cursor.getLong(0);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipTagInfoEntityAscomExampleCelestialappDataLocalEntitiesTagInfoEntity(
      final LongSparseArray<ArrayList<TagInfoEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<TagInfoEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<TagInfoEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipTagInfoEntityAscomExampleCelestialappDataLocalEntitiesTagInfoEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<TagInfoEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipTagInfoEntityAscomExampleCelestialappDataLocalEntitiesTagInfoEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `TagInfoEntity`.`tagId` AS `tagId`,`TagInfoEntity`.`name` AS `name`,_junction.`celestialId` FROM `CelestialTagCrossRef` AS _junction INNER JOIN `TagInfoEntity` ON (_junction.`tagId` = `TagInfoEntity`.`tagId`) WHERE _junction.`celestialId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 2; // _junction.celestialId;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfTagId = 0;
      final int _cursorIndexOfName = 1;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<TagInfoEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final TagInfoEntity _item_1;
          final int _tmpTagId;
          _tmpTagId = _cursor.getInt(_cursorIndexOfTagId);
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          _item_1 = new TagInfoEntity(_tmpTagId,_tmpName);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipCelestialInfoEntityAscomExampleCelestialappDataLocalEntitiesCelestialInfoEntity(
      final LongSparseArray<ArrayList<CelestialInfoEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<CelestialInfoEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<CelestialInfoEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipCelestialInfoEntityAscomExampleCelestialappDataLocalEntitiesCelestialInfoEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<CelestialInfoEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipCelestialInfoEntityAscomExampleCelestialappDataLocalEntitiesCelestialInfoEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `CelestialInfoEntity`.`celestialId` AS `celestialId`,`CelestialInfoEntity`.`nasa_id` AS `nasa_id`,`CelestialInfoEntity`.`title` AS `title`,`CelestialInfoEntity`.`date` AS `date`,`CelestialInfoEntity`.`dateFavouriteCreated` AS `dateFavouriteCreated`,`CelestialInfoEntity`.`description` AS `description`,`CelestialInfoEntity`.`image` AS `image`,`CelestialInfoEntity`.`image_path` AS `image_path`,_junction.`tagId` FROM `CelestialTagCrossRef` AS _junction INNER JOIN `CelestialInfoEntity` ON (_junction.`celestialId` = `CelestialInfoEntity`.`celestialId`) WHERE _junction.`tagId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 8; // _junction.tagId;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfCelestialId = 0;
      final int _cursorIndexOfNasaId = 1;
      final int _cursorIndexOfTitle = 2;
      final int _cursorIndexOfDate = 3;
      final int _cursorIndexOfDateFavouriteCreated = 4;
      final int _cursorIndexOfDescription = 5;
      final int _cursorIndexOfImage = 6;
      final int _cursorIndexOfImagePath = 7;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<CelestialInfoEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final CelestialInfoEntity _item_1;
          final int _tmpCelestialId;
          _tmpCelestialId = _cursor.getInt(_cursorIndexOfCelestialId);
          final String _tmpNasaId;
          if (_cursor.isNull(_cursorIndexOfNasaId)) {
            _tmpNasaId = null;
          } else {
            _tmpNasaId = _cursor.getString(_cursorIndexOfNasaId);
          }
          final String _tmpTitle;
          if (_cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          }
          final String _tmpDate;
          if (_cursor.isNull(_cursorIndexOfDate)) {
            _tmpDate = null;
          } else {
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
          }
          final Long _tmpDateFavouriteCreated;
          if (_cursor.isNull(_cursorIndexOfDateFavouriteCreated)) {
            _tmpDateFavouriteCreated = null;
          } else {
            _tmpDateFavouriteCreated = _cursor.getLong(_cursorIndexOfDateFavouriteCreated);
          }
          final String _tmpDescription;
          if (_cursor.isNull(_cursorIndexOfDescription)) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
          }
          final byte[] _tmpImage;
          if (_cursor.isNull(_cursorIndexOfImage)) {
            _tmpImage = null;
          } else {
            _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
          }
          final String _tmpImagePath;
          if (_cursor.isNull(_cursorIndexOfImagePath)) {
            _tmpImagePath = null;
          } else {
            _tmpImagePath = _cursor.getString(_cursorIndexOfImagePath);
          }
          _item_1 = new CelestialInfoEntity(_tmpCelestialId,_tmpNasaId,_tmpTitle,_tmpDate,_tmpDateFavouriteCreated,_tmpDescription,_tmpImage,_tmpImagePath);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }

  private void __fetchRelationshipKeywordInfoEntityAscomExampleCelestialappDataLocalEntitiesKeywordInfoEntity(
      final LongSparseArray<ArrayList<KeywordInfoEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<KeywordInfoEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<KeywordInfoEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipKeywordInfoEntityAscomExampleCelestialappDataLocalEntitiesKeywordInfoEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<KeywordInfoEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipKeywordInfoEntityAscomExampleCelestialappDataLocalEntitiesKeywordInfoEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `keywordId`,`name` FROM `KeywordInfoEntity` WHERE `keywordId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "keywordId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfKeywordId = 0;
      final int _cursorIndexOfName = 1;
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<KeywordInfoEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final KeywordInfoEntity _item_1;
          final int _tmpKeywordId;
          _tmpKeywordId = _cursor.getInt(_cursorIndexOfKeywordId);
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          _item_1 = new KeywordInfoEntity(_tmpKeywordId,_tmpName);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
