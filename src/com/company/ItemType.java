package com.company;
/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

/**
 * Victoria Bagnall
 * OOP Program Alpha
 *
 * @author Victoria Bagnall
 * @version 1
 * @since 1
 */

// create enum of ItemType
public enum ItemType {

    //Creating each type of ItemType that is currently in production
    AUDIO("AU"),
    VISUAL("VI"),
    AUDIO_MOBILE("AM"),
    AUDIO_VISUAL("VM");

    //A String to attribute each type to a variable
    public final String code;

    //Constructor to allow the use of Type outside of the ItemType enum
    ItemType(String code) {
        this.code = code;
    }

    //Get method so the private String type can be accessed outside of this class
    public String getCode() {
        return code;
    }
}
