/*
 *  Copyright 2016 Lixplor
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.lixplor.fastutil.utils.builders;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;

import java.io.File;

/**
 * Created :  2016-08-11
 * Author  :  Lixplor
 * Web     :  http://blog.lixplor.com
 * Email   :  me@lixplor.com
 */
public class DirectoryUtil {

    private DirectoryUtil() throws IllegalAccessException {
        throw new IllegalAccessException("Instantiation is not allowed! Use static methods only!");
    }

    /**
     * Return root of the "system" partition holding the core Android OS. Always present and mounted read-only.
     *
     * @return directory file
     */
    public static File getRootDir() {
        return Environment.getRootDirectory();
    }

    /**
     * Return the user data directory.
     *
     * @return directory file
     */
    public static File getDataDir() {
        return Environment.getDataDirectory();
    }

    /**
     * Return the download/cache content directory
     *
     * @return directory file
     */
    public static File getDownloadCacheDir() {
        return Environment.getDownloadCacheDirectory();
    }

    /**
     * Return the primary external storage directory.
     *
     * @return directory file
     */
    public static File getExternalStorageDir() {
        return Environment.getExternalStorageDirectory();
    }

    /**
     * Get a top-level public external storage directory for placing files of a particular type.
     *
     * @param dirType Should be one of DIRECTORY_MUSIC, DIRECTORY_PODCASTS, DIRECTORY_RINGTONES, DIRECTORY_ALARMS, DIRECTORY_NOTIFICATIONS, DIRECTORY_PICTURES, DIRECTORY_MOVIES, DIRECTORY_DOWNLOADS, or DIRECTORY_DCIM. May not be null.
     * @return directory file
     */
    public static File getExternalPublicDir(String dirType) {
        return Environment.getExternalStoragePublicDirectory(dirType);
    }

    /**
     * Get external alarms directory
     *
     * @return directory file
     */
    public static File getExternalAlarmDir() {
        return getExternalPublicDir(Environment.DIRECTORY_ALARMS);
    }

    /**
     * Get external camera directory
     *
     * @return directory file
     */
    public static File getExternalDCIMDir() {
        return getExternalPublicDir(Environment.DIRECTORY_DCIM);
    }

    /**
     * Get external documents directory
     *
     * @return directory file
     */
    public static File getExternalDocumentDir() {
        return getExternalPublicDir(Environment.DIRECTORY_DOCUMENTS);
    }

    /**
     * Get external downloads directory
     *
     * @return directory file
     */
    public static File getExternalDownloadDir() {
        return getExternalPublicDir(Environment.DIRECTORY_DOWNLOADS);
    }

    /**
     * Get external movies directory
     *
     * @return directory file
     */
    public static File getExternalMovieDir() {
        return getExternalPublicDir(Environment.DIRECTORY_MOVIES);
    }

    /**
     * Get external music directory
     *
     * @return directory file
     */
    public static File getExternalMusicDir() {
        return getExternalPublicDir(Environment.DIRECTORY_MUSIC);
    }

    /**
     * Get external notifications directory
     *
     * @return directory file
     */
    public static File getExternalNotificationDir() {
        return getExternalPublicDir(Environment.DIRECTORY_NOTIFICATIONS);
    }

    /**
     * Get external pictures directory
     *
     * @return directory file
     */
    public static File getExternalPictureDir() {
        return getExternalPublicDir(Environment.DIRECTORY_PICTURES);
    }

    /**
     * Get external podcasts directory
     *
     * @return directory file
     */
    public static File getExternalPodcastDir() {
        return getExternalPublicDir(Environment.DIRECTORY_PODCASTS);
    }

    /**
     * Get external ringtone directory
     *
     * @return directory file
     */
    public static File getExternalRingtoneDir() {
        return getExternalPublicDir(Environment.DIRECTORY_RINGTONES);
    }

    /**
     * Get internal cache directory of a specific app
     *
     * @param packageName package name
     * @return directory file
     */
    public static File getCacheDir(String packageName) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getCacheDir();
    }

    /**
     * Get internal files directory of a specific app
     *
     * @param packageName package name
     * @return directory file
     */
    public static File getFilesDir(String packageName) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getFilesDir();
    }

    /**
     * Get internal obb directory of a specific app
     *
     * @param packageName package name
     * @return directory file
     */
    public static File getObbDir(String packageName) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getObbDir();
    }

    /**
     * Get internal obb directories of a specific app
     *
     * @param packageName package name
     * @return directory files
     */
    public static File[] getObbDirs(String packageName) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getObbDirs();
    }

    /**
     * Get internal code cache directory of a specific app
     *
     * @param packageName package name
     * @return directory file
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static File getCodeCacheDir(String packageName) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getCodeCacheDir();
    }

    /**
     * Get external cache directory of a specific app
     *
     * @param packageName package name
     * @return directory file
     */
    public static File getExternalCacheDir(String packageName) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getExternalCacheDir();
    }

    /**
     * Get external cache directories of a specific app
     *
     * @param packageName package name
     * @return directory files
     */
    public static File[] getExternalCacheDirs(String packageName) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getExternalCacheDirs();
    }

    /**
     * Get external files directory of a specific app
     *
     * @param packageName package name
     * @return directory file
     */
    public static File getExternalFilesDir(String packageName, String type) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getExternalFilesDir(type);
    }

    /**
     * Get external file directories of a specific app
     *
     * @param packageName package name
     * @return directory files
     */
    public static File[] getExternalFilesDirs(String packageName, String type) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getExternalFilesDirs(type);
    }

    /**
     * Get external media directories of a specific app
     *
     * @param packageName package name
     * @return directory files
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static File[] getExternalMediaDirs(String packageName) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getExternalMediaDirs();
    }

    /**
     * Get no backup directory of a specific app
     *
     * @param packageName package name
     * @return directory file
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static File getNoBackupFilesDir(String packageName) {
        Context context = ContextUtil.getPackageContext(packageName);
        return context.getNoBackupFilesDir();
    }

    /**
     * Get system root directory path
     *
     * @return directory path
     */
    public static String getRootDirPath() {
        return getRootDir().getAbsolutePath();
    }

    /**
     * Get system data directory path
     *
     * @return directory path
     */
    public static String getDataDirPath() {
        return getDataDir().getAbsolutePath();
    }

    /**
     * Get system download/cache directory path
     *
     * @return directory path
     */
    public static String getDownloadCacheDirPath() {
        return getExternalDownloadDir().getAbsolutePath();
    }

    /**
     * Get external storage directory path
     *
     * @return directory path
     */
    public static String getExternalStorageDirPath() {
        return getExternalStorageDir().getAbsolutePath();
    }

    /**
     * Get external directory path
     *
     * @param dirType Should be one of DIRECTORY_MUSIC, DIRECTORY_PODCASTS, DIRECTORY_RINGTONES, DIRECTORY_ALARMS, DIRECTORY_NOTIFICATIONS, DIRECTORY_PICTURES, DIRECTORY_MOVIES, DIRECTORY_DOWNLOADS, or DIRECTORY_DCIM. May not be null.
     * @return directory path
     */
    public static String getExternalPublicDirPath(String dirType) {
        return getExternalPublicDir(dirType).getAbsolutePath();
    }

    /**
     * Get external alarm directory path
     *
     * @return directory path
     */
    public static String getExternalAlarmDirPath() {
        return getExternalAlarmDir().getAbsolutePath();
    }


    /**
     * Get external camera directory path
     *
     * @return directory path
     */
    public static String getExternalDCIMDirPath() {
        return getExternalDCIMDir().getAbsolutePath();
    }

    /**
     * Get external document directory path
     *
     * @return directory path
     */
    public static String getExternalDocumentDirPath() {
        return getExternalDocumentDir().getAbsolutePath();
    }

    /**
     * Get external download directory path
     *
     * @return directory path
     */
    public static String getExternalDownloadDirPath() {
        return getExternalDownloadDir().getAbsolutePath();
    }

    /**
     * Get external movie directory path
     *
     * @return directory path
     */
    public static String getExternalMovieDirPath() {
        return getExternalMovieDir().getAbsolutePath();
    }

    /**
     * Get external music directory path
     *
     * @return directory path
     */
    public static String getExternalMusicDirPath() {
        return getExternalMusicDir().getAbsolutePath();
    }

    /**
     * Get external notification directory path
     *
     * @return directory path
     */
    public static String getExternalNotificationDirPath() {
        return getExternalNotificationDir().getAbsolutePath();
    }

    /**
     * Get external picture directory path
     *
     * @return directory path
     */
    public static String getExternalPictureDirPath() {
        return getExternalPictureDir().getAbsolutePath();
    }

    /**
     * Get external podcast directory path
     *
     * @return directory path
     */
    public static String getExternalPodcastDirPath() {
        return getExternalPodcastDir().getAbsolutePath();
    }

    /**
     * Get external ringtone directory path
     *
     * @return directory path
     */
    public static String getExternalRingtoneDirPath() {
        return getExternalRingtoneDir().getAbsolutePath();
    }
}
