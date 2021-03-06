package com.crescentflare.unilayoutexample.reusingcontainer;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.crescentflare.unilayout.containers.UniReusingContainer;
import com.crescentflare.unilayoutexample.R;

/**
 * The reusing container activity shows a list of items within a recycler view
 */
public class ReusingContainerActivity extends AppCompatActivity
{
    // ---
    // Members
    // ---

    private ReusingContainerAdapter adapter = new ReusingContainerAdapter();


    // ---
    // Initialization
    // ---

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // Configure title
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reusing_container);
        setTitle(getString(R.string.example_reusing_container));

        // Set up action bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
        }

        // Initialize reusing container
        UniReusingContainer reusingView = (UniReusingContainer)findViewById(R.id.activity_reusing_container_view);
        reusingView.setAdapter(adapter);

        // Add all items
        adapter.addItem(new ReusableItem(ReusableItem.Type.Section, "Supported containers"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.TopDivider));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Horizontal scroll container", "Contains a single content view which can scroll horizontally, use linear container as a content view for scrollable layouts", "Scroll"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Vertical scroll container", "Contains a single content view which can scroll vertically, use linear container as a content view for scrollable layouts", "Scroll"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Linear container", "Aligns items horizontally or vertically, depending on its orientation", "Layout"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Frame container", "A simple container to contain one view, or add multiple overlapping views", "Layout"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Reusing container", "A vertical layout container with scrolling with reusable views, also supports selection and swiping", "Layout/Scroll"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.BottomDivider));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Section, "Supported views"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.TopDivider));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Button view", "Extends Button, currently only used to match the naming convention with iOS", "Button"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Image view", "Extends ImageView, currently only used to match the naming convention with iOS", "Image"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Text view", "Extends TextView, currently only used to match the naming convention with iOS", "Text"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Switch view", "Extends SwitchCompat, currently only used to match the naming convention with iOS", "Control"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Spinner view", "Extends ProgressBar, currently only used to match the naming convention with iOS", "Indicator"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Web view", "Extends WebView, currently only used to match the naming convention with iOS", "Web content"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "View", "Extends View to support padding for size calculation", "Container"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.Item, "Reusable view", "A view to be used by the reusing container which can be reused while scrolling", "Container"));
        adapter.addItem(new ReusableItem(ReusableItem.Type.BottomDivider));

        // Disable interaction
        for (int i = 0; i < adapter.getItemCount(); i++)
        {
            adapter.setItemEnabled(i, false);
        }
    }


    // ---
    // Menu handling
    // ---

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == android.R.id.home)
        {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
