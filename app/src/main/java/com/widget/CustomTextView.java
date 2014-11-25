package com.widget;

/*
 * Copyright (C) 2014 The Blue Pandora Project Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.widget.helper.CustomFontHelper;

public class CustomTextView extends TextView {

    public CustomTextView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
        init(null);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        init(attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        // TODO Auto-generated method stub
        CustomFontHelper.setCustomFont(this, this.getContext(), attrs);
    }

    @Override
    public boolean isInEditMode() {
        // TODO Auto-generated method stub
        return true;
    }

}
