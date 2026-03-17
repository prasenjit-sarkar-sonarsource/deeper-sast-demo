package com.dashboardmanager.utils;

public final class FileUtils {

    private static final String IMAGE_PATH = "./public/img/";
    private static final String USER_PATH = "./users/";

    private FileUtils() {
    }

    public static String getImagePath() {
        return IMAGE_PATH;
    }

    public static String getUserImagePath(String username) {
        String path = getImagePath();
        path += EncodingUtils.decodeParameter(username);
        return path;
    }
}
