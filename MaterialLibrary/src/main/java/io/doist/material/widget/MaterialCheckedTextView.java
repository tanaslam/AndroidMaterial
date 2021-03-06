package io.doist.material.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

import io.doist.material.widget.utils.MaterialWidgetHandler;

public class MaterialCheckedTextView extends CheckedTextView {
    private static final MaterialWidgetHandler.Styleable[] sHiddenStyleables = {
            MaterialWidgetHandler.Styleable.CHECKED_TEXT_VIEW,
            MaterialWidgetHandler.Styleable.TEXT_VIEW,
            MaterialWidgetHandler.Styleable.VIEW
    };

    public MaterialCheckedTextView(Context context) {
        this(context, null);
    }

    public MaterialCheckedTextView(Context context, AttributeSet attrs) {
        this(context, attrs, getDefStyle());
    }

    public MaterialCheckedTextView(Context context, AttributeSet attrs, int defStyle) {
        super(MaterialWidgetHandler.themifyContext(context, attrs),
              MaterialWidgetHandler.hideStyleableAttributes(attrs, sHiddenStyleables), defStyle);
        MaterialWidgetHandler.restoreStyleableAttributes(sHiddenStyleables);
        MaterialWidgetHandler.init(this, attrs, defStyle, sHiddenStyleables);
    }

    private static int getDefStyle() {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.JELLY_BEAN) {
            return android.R.attr.checkedTextViewStyle;
        } else {
            return 0;
        }
    }
}
