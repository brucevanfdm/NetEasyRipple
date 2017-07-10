package com.fdm.neteasyripple;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Draw Circle
 * Created by fdm on 2017/7/10.
 */
public class RippleCircleView extends View {

    private RippleAnimationView rippleAnimationView;

    public RippleCircleView(Context context) {
        super(context);
    }

    public RippleCircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RippleCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RippleCircleView(RippleAnimationView rippleAnimationView, Context context) {
        super(context);
        this.rippleAnimationView = rippleAnimationView;
        this.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int radius = (Math.min(getWidth(), getHeight())) / 2;
        canvas.drawCircle(radius, radius, radius - rippleAnimationView.rippleStrokeWidth, rippleAnimationView.paint);
    }
}
