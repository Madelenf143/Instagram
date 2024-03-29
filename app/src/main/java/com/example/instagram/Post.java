package com.example.instagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";

    public String getKeyDescription () {
       return getString(KEY_DESCRIPTION);

    }

    public void setKeyDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }

    public ParseFile getImage() {
        return getParseFile(KEY_IMAGE);
    }
    public void  setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }
    public ParseUser getuser() {
        return getParseUser(KEY_USER);
    }
    public void  setUser(ParseUser parseUser) {
        put(KEY_USER, parseUser);
    }
}
