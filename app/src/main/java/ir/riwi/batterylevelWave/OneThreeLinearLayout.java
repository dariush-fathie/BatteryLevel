package ir.riwi.batterylevelWave;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class OneThreeLinearLayout extends FrameLayout {
    public OneThreeLinearLayout(Context context) {
        super(context);
    }

    public OneThreeLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public OneThreeLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public OneThreeLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, 3 * widthMeasureSpec);
    }
}
