package io.doist.material.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import io.doist.material.widget.utils.MaterialWidgetHandler;

public class MaterialView extends View {
    private static final MaterialWidgetHandler.Styleable[] sHiddenStyleables = {
            MaterialWidgetHandler.Styleable.VIEW
    };

    public MaterialView(Context context) {
        this(context, null);
    }

    public MaterialView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialView(Context context, AttributeSet attrs, int defStyle) {
        super(MaterialWidgetHandler.themifyContext(context, attrs),
              MaterialWidgetHandler.hideStyleableAttributes(attrs, sHiddenStyleables), defStyle);
        MaterialWidgetHandler.restoreStyleableAttributes(sHiddenStyleables);
        MaterialWidgetHandler.init(this, attrs, defStyle, sHiddenStyleables);
    }
}
