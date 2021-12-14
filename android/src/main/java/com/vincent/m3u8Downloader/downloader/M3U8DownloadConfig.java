package com.vincent.m3u8Downloader.downloader;

import android.content.Context;
import android.os.Environment;

import com.vincent.m3u8Downloader.utils.SpHelper;

import java.io.File;

/**
 * @Author: Vincent
 * @CreateAt: 2021/08/25 21:37
 * @Desc: 配置类
 */
public class M3U8DownloadConfig {
    private static final String TAG_SAVE_DIR = "TAG_SAVE_DIR_M3U8";
    private static final String TAG_THREAD_COUNT = "TAG_THREAD_COUNT_M3U8";
    private static final String TAG_CONN_TIMEOUT = "TAG_CONN_TIMEOUT_M3U8";
    private static final String TAG_READ_TIMEOUT = "TAG_READ_TIMEOUT_M3U8";
    private static final String TAG_DEBUG = "TAG_DEBUG_M3U8";
    private static final String TAG_SHOW_NOTIFICATION = "TAG_SHOW_NOTIFICATION_M3U8";
    private static final String TAG_CONVERT_MP4 = "TAG_CONVERT_MP4";
    private static final String TAG_PREPARE_TEXT = "TAG_PREPARE_TEXT";
    private static final String TAG_PENDING_TEXT = "TAG_PENDING_TEXT";
    private static final String TAG_DOWNLOADING_TEXT = "TAG_DOWNLOADING_TEXT";
    private static final String TAG_PAUSE_TEXT = "TAG_PAUSE_TEXT";
    private static final String TAG_SUCCESS_TEXT = "TAG_SUCCESS_TEXT";
    private static final String TAG_FAILED_TEXT = "TAG_FAILED_TEXT";

    public static M3U8DownloadConfig build(Context context){
        SpHelper.init(context);
        return new M3U8DownloadConfig();
    }

    public M3U8DownloadConfig setSaveDir(String saveDir){
        SpHelper.putString(TAG_SAVE_DIR, saveDir);
        return this;
    }

    @SuppressWarnings("deprecation")
    public static String getSaveDir(){
        return SpHelper.getString(TAG_SAVE_DIR, Environment.getExternalStorageDirectory().getPath() + File.separator + "M3u8Downloader");
    }

    public M3U8DownloadConfig setThreadCount(int threadCount){
        if (threadCount > 5) threadCount = 5;
        if (threadCount <= 0) threadCount = 1;
        SpHelper.putInt(TAG_THREAD_COUNT, threadCount);
        return this;
    }

    public static int getThreadCount(){
        return SpHelper.getInt(TAG_THREAD_COUNT, 3);
    }

    public M3U8DownloadConfig setConnTimeout(int connTimeout){
        SpHelper.putInt(TAG_CONN_TIMEOUT, connTimeout);
        return this;
    }

    public static int getConnTimeout(){
        return SpHelper.getInt(TAG_CONN_TIMEOUT, 10 * 1000);
    }

    public M3U8DownloadConfig setReadTimeout(int readTimeout){
        SpHelper.putInt(TAG_READ_TIMEOUT, readTimeout);
        return this;
    }

    public static int getReadTimeout(){
        return SpHelper.getInt(TAG_READ_TIMEOUT, 30 * 60 * 1000);
    }


    public M3U8DownloadConfig setDebugMode(boolean debug){
        SpHelper.putBoolean(TAG_DEBUG, debug);
        return this;
    }

    public static boolean isDebugMode(){
        return SpHelper.getBoolean(TAG_DEBUG, false);
    }

    public M3U8DownloadConfig setShowNotification(boolean show){
        SpHelper.putBoolean(TAG_SHOW_NOTIFICATION, show);
        return this;
    }

    public static boolean isShowNotification(){
        return SpHelper.getBoolean(TAG_SHOW_NOTIFICATION, true);
    }

    public M3U8DownloadConfig setConvertMp4(boolean convertMp4){
        SpHelper.putBoolean(TAG_CONVERT_MP4, convertMp4);
        return this;
    }

    public M3U8DownloadConfig setPrepareText(String prepareText){
        SpHelper.putString(TAG_PREPARE_TEXT, prepareText);
        return this;
    }

    public static String getPrepareText() {
        return SpHelper.getString(TAG_PREPARE_TEXT, "Preparing...");
    }
    public M3U8DownloadConfig setPendingText(String pendingText){
        SpHelper.putString(TAG_PENDING_TEXT, pendingText);
        return this;
    }

    public static String getPendingText() {
        return SpHelper.getString(TAG_PENDING_TEXT, "Pending...");
    }

    public M3U8DownloadConfig setDownloadingText(String downloadingText){
        SpHelper.putString(TAG_DOWNLOADING_TEXT, downloadingText);
        return this;
    }

    public static String getDownloadingText() {
        return SpHelper.getString(TAG_DOWNLOADING_TEXT, "Downloading...");
    }

    public M3U8DownloadConfig setPauseText(String pauseText){
        SpHelper.putString(TAG_PAUSE_TEXT, pauseText);
        return this;
    }

    public static String getPauseText() {
        return SpHelper.getString(TAG_PAUSE_TEXT, "Pause");
    }

    public M3U8DownloadConfig setSuccessText(String successText){
        SpHelper.putString(TAG_SUCCESS_TEXT, successText);
        return this;
    }

    public static String getSuccessText() {
        return SpHelper.getString(TAG_SUCCESS_TEXT, "Success");
    }

    public M3U8DownloadConfig setFailedText(String failedText){
        SpHelper.putString(TAG_FAILED_TEXT, failedText);
        return this;
    }

    public static String getFailedText() {
        return SpHelper.getString(TAG_FAILED_TEXT, "Failed");
    }


    public static boolean isConvertMp4(){
        return SpHelper.getBoolean(TAG_CONVERT_MP4, false);
    }
}
