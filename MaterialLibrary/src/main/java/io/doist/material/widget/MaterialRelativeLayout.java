package io.doist.material.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import io.doist.material.widget.utils.MaterialWidgetHandler;

public class MaterialRelativeLayout extends RelativeLayout {
    private static final MaterialWidgetHandler.Styleable[] sHiddenStyleables = {
            MaterialWidgetHandler.Styleable.VIEW
    };

    public MaterialRelativeLayout(Context context) {
        this(context, null);
    }

    public MaterialRelativeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialRelativeLayout(Context context, AttributeSet attrs, int defStyle) {
        super(MaterialWidgetHandler.themifyContext(context, attrs),
              MaterialWidgetHandler.hideStyleableAttributes(attrs, sHiddenStyleables), defStyle);
        MaterialWidgetHandler.restoreStyleableAttributes(sHiddenStyleables);
        MaterialWidgetHandler.init(this, attrs, defStyle, sHiddenStyleables);
    }
}
