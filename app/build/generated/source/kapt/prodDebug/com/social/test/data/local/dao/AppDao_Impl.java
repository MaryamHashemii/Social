package com.social.test.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.social.test.data.local.dto.ItemPostRepositoryModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ItemPostRepositoryModel> __insertionAdapterOfItemPostRepositoryModel;

  private final EntityDeletionOrUpdateAdapter<ItemPostRepositoryModel> __updateAdapterOfItemPostRepositoryModel;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItemPostRepositoryModel = new EntityInsertionAdapter<ItemPostRepositoryModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `post` (`id`,`likeCount`,`isLiked`,`commentCount`,`comments`,`imageUrl`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemPostRepositoryModel value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getLikeCount());
        final int _tmp;
        _tmp = value.isLiked() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getCommentCount());
        if (value.getComments() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getComments());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImageUrl());
        }
      }
    };
    this.__updateAdapterOfItemPostRepositoryModel = new EntityDeletionOrUpdateAdapter<ItemPostRepositoryModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `post` SET `id` = ?,`likeCount` = ?,`isLiked` = ?,`commentCount` = ?,`comments` = ?,`imageUrl` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemPostRepositoryModel value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getLikeCount());
        final int _tmp;
        _tmp = value.isLiked() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        stmt.bindLong(4, value.getCommentCount());
        if (value.getComments() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getComments());
        }
        if (value.getImageUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getImageUrl());
        }
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public Object savePostRepositories(final List<ItemPostRepositoryModel> postList,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItemPostRepositoryModel.insert(postList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updatePostRepositories(final ItemPostRepositoryModel post,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfItemPostRepositoryModel.handle(post);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getPostRepositories(final int limit, final int offset,
      final Continuation<? super List<ItemPostRepositoryModel>> continuation) {
    final String _sql = "SELECT * FROM post ORDER BY id ASC LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    _argIndex = 2;
    _statement.bindLong(_argIndex, offset);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ItemPostRepositoryModel>>() {
      @Override
      public List<ItemPostRepositoryModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfLikeCount = CursorUtil.getColumnIndexOrThrow(_cursor, "likeCount");
          final int _cursorIndexOfIsLiked = CursorUtil.getColumnIndexOrThrow(_cursor, "isLiked");
          final int _cursorIndexOfCommentCount = CursorUtil.getColumnIndexOrThrow(_cursor, "commentCount");
          final int _cursorIndexOfComments = CursorUtil.getColumnIndexOrThrow(_cursor, "comments");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
          final List<ItemPostRepositoryModel> _result = new ArrayList<ItemPostRepositoryModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ItemPostRepositoryModel _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpLikeCount;
            _tmpLikeCount = _cursor.getInt(_cursorIndexOfLikeCount);
            final boolean _tmpIsLiked;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsLiked);
            _tmpIsLiked = _tmp != 0;
            final int _tmpCommentCount;
            _tmpCommentCount = _cursor.getInt(_cursorIndexOfCommentCount);
            final String _tmpComments;
            if (_cursor.isNull(_cursorIndexOfComments)) {
              _tmpComments = null;
            } else {
              _tmpComments = _cursor.getString(_cursorIndexOfComments);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            _item = new ItemPostRepositoryModel(_tmpId,_tmpLikeCount,_tmpIsLiked,_tmpCommentCount,_tmpComments,_tmpImageUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
