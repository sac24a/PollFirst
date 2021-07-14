package com.candlestickschart.pollfirst;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PollFirstDao {
    @Query("Select * from pollfirst")
    List<PollFirstData> getPollfirstData();
    @Query("DELETE FROM pollfirst")
    void clearTable();
    @Insert
    void insertPollFirst(PollFirstData pollFirstData);
    @Update
    void updatePollFirst(PollFirstData pollFirstData);
    @Delete
    void deletePollFirst(PollFirstData pollFirstData);
}
