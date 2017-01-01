package com.crescentflare.unilayout.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.Button;

/**
 * UniLayout view: a web view
 * Extends WebView, currently it's just an alias to have the same name as the iOS class
 */
public class UniWebView extends WebView
{
    // ---
    // Initialization
    // ---

    public UniWebView(Context context)
    {
        this(context, (AttributeSet)null);
    }

    public UniWebView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(attrs);
    }

    public UniWebView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        this(context, attrs);
    }

    public UniWebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        this(context, attrs);
    }

    private void init(AttributeSet attrs)
    {
    }
}
