package com.example.celestialapp.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CelestialDatabase_Impl extends CelestialDatabase {
  private volatile CelestialInfoDao _celestialInfoDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CelestialInfoEntity` (`celestialId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nasa_id` TEXT NOT NULL, `title` TEXT NOT NULL, `date` TEXT NOT NULL, `dateFavouriteCreated` INTEGER, `description` TEXT NOT NULL, `image` BLOB, `image_path` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TagInfoEntity` (`tagId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `KeywordInfoEntity` (`keywordId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CelestialTagCrossRef` (`celestialId` INTEGER NOT NULL, `tagId` INTEGER NOT NULL, PRIMARY KEY(`celestialId`, `tagId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CelestialKeywordCrossRef` (`celestialId` INTEGER NOT NULL, `keywordId` INTEGER NOT NULL, PRIMARY KEY(`celestialId`, `keywordId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e79bec5d6ca6246e48394b954063ea23')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `CelestialInfoEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `TagInfoEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `KeywordInfoEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `CelestialTagCrossRef`");
        _db.execSQL("DROP TABLE IF EXISTS `CelestialKeywordCrossRef`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCelestialInfoEntity = new HashMap<String, TableInfo.Column>(8);
        _columnsCelestialInfoEntity.put("celestialId", new TableInfo.Column("celestialId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCelestialInfoEntity.put("nasa_id", new TableInfo.Column("nasa_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCelestialInfoEntity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCelestialInfoEntity.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCelestialInfoEntity.put("dateFavouriteCreated", new TableInfo.Column("dateFavouriteCreated", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCelestialInfoEntity.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCelestialInfoEntity.put("image", new TableInfo.Column("image", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCelestialInfoEntity.put("image_path", new TableInfo.Column("image_path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCelestialInfoEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCelestialInfoEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCelestialInfoEntity = new TableInfo("CelestialInfoEntity", _columnsCelestialInfoEntity, _foreignKeysCelestialInfoEntity, _indicesCelestialInfoEntity);
        final TableInfo _existingCelestialInfoEntity = TableInfo.read(_db, "CelestialInfoEntity");
        if (! _infoCelestialInfoEntity.equals(_existingCelestialInfoEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "CelestialInfoEntity(com.example.celestialapp.data.local.entities.CelestialInfoEntity).\n"
                  + " Expected:\n" + _infoCelestialInfoEntity + "\n"
                  + " Found:\n" + _existingCelestialInfoEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsTagInfoEntity = new HashMap<String, TableInfo.Column>(2);
        _columnsTagInfoEntity.put("tagId", new TableInfo.Column("tagId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTagInfoEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTagInfoEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTagInfoEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTagInfoEntity = new TableInfo("TagInfoEntity", _columnsTagInfoEntity, _foreignKeysTagInfoEntity, _indicesTagInfoEntity);
        final TableInfo _existingTagInfoEntity = TableInfo.read(_db, "TagInfoEntity");
        if (! _infoTagInfoEntity.equals(_existingTagInfoEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "TagInfoEntity(com.example.celestialapp.data.local.entities.TagInfoEntity).\n"
                  + " Expected:\n" + _infoTagInfoEntity + "\n"
                  + " Found:\n" + _existingTagInfoEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsKeywordInfoEntity = new HashMap<String, TableInfo.Column>(2);
        _columnsKeywordInfoEntity.put("keywordId", new TableInfo.Column("keywordId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKeywordInfoEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysKeywordInfoEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesKeywordInfoEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoKeywordInfoEntity = new TableInfo("KeywordInfoEntity", _columnsKeywordInfoEntity, _foreignKeysKeywordInfoEntity, _indicesKeywordInfoEntity);
        final TableInfo _existingKeywordInfoEntity = TableInfo.read(_db, "KeywordInfoEntity");
        if (! _infoKeywordInfoEntity.equals(_existingKeywordInfoEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "KeywordInfoEntity(com.example.celestialapp.data.local.entities.KeywordInfoEntity).\n"
                  + " Expected:\n" + _infoKeywordInfoEntity + "\n"
                  + " Found:\n" + _existingKeywordInfoEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsCelestialTagCrossRef = new HashMap<String, TableInfo.Column>(2);
        _columnsCelestialTagCrossRef.put("celestialId", new TableInfo.Column("celestialId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCelestialTagCrossRef.put("tagId", new TableInfo.Column("tagId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCelestialTagCrossRef = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCelestialTagCrossRef = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCelestialTagCrossRef = new TableInfo("CelestialTagCrossRef", _columnsCelestialTagCrossRef, _foreignKeysCelestialTagCrossRef, _indicesCelestialTagCrossRef);
        final TableInfo _existingCelestialTagCrossRef = TableInfo.read(_db, "CelestialTagCrossRef");
        if (! _infoCelestialTagCrossRef.equals(_existingCelestialTagCrossRef)) {
          return new RoomOpenHelper.ValidationResult(false, "CelestialTagCrossRef(com.example.celestialapp.data.local.entities.CelestialTagCrossRef).\n"
                  + " Expected:\n" + _infoCelestialTagCrossRef + "\n"
                  + " Found:\n" + _existingCelestialTagCrossRef);
        }
        final HashMap<String, TableInfo.Column> _columnsCelestialKeywordCrossRef = new HashMap<String, TableInfo.Column>(2);
        _columnsCelestialKeywordCrossRef.put("celestialId", new TableInfo.Column("celestialId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCelestialKeywordCrossRef.put("keywordId", new TableInfo.Column("keywordId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCelestialKeywordCrossRef = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCelestialKeywordCrossRef = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCelestialKeywordCrossRef = new TableInfo("CelestialKeywordCrossRef", _columnsCelestialKeywordCrossRef, _foreignKeysCelestialKeywordCrossRef, _indicesCelestialKeywordCrossRef);
        final TableInfo _existingCelestialKeywordCrossRef = TableInfo.read(_db, "CelestialKeywordCrossRef");
        if (! _infoCelestialKeywordCrossRef.equals(_existingCelestialKeywordCrossRef)) {
          return new RoomOpenHelper.ValidationResult(false, "CelestialKeywordCrossRef(com.example.celestialapp.data.local.entities.CelestialKeywordCrossRef).\n"
                  + " Expected:\n" + _infoCelestialKeywordCrossRef + "\n"
                  + " Found:\n" + _existingCelestialKeywordCrossRef);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "e79bec5d6ca6246e48394b954063ea23", "136f1f1805985c91cedfa51cc80ad752");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "CelestialInfoEntity","TagInfoEntity","KeywordInfoEntity","CelestialTagCrossRef","CelestialKeywordCrossRef");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `CelestialInfoEntity`");
      _db.execSQL("DELETE FROM `TagInfoEntity`");
      _db.execSQL("DELETE FROM `KeywordInfoEntity`");
      _db.execSQL("DELETE FROM `CelestialTagCrossRef`");
      _db.execSQL("DELETE FROM `CelestialKeywordCrossRef`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CelestialInfoDao.class, CelestialInfoDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public CelestialInfoDao getConnectCelestialDao() {
    if (_celestialInfoDao != null) {
      return _celestialInfoDao;
    } else {
      synchronized(this) {
        if(_celestialInfoDao == null) {
          _celestialInfoDao = new CelestialInfoDao_Impl(this);
        }
        return _celestialInfoDao;
      }
    }
  }
}
