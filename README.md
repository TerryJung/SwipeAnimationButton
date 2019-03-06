# SwipeAnimationButton
SwipeAnimationButton is a custom swipe Button of Android ui. you can swipe both sides. SwipeAnimationButton's get inspiration from [AndroidPub](https://android.jlelse.eu/make-a-great-android-ux-how-to-make-a-swipe-button-eefbf060326d). This library is very small and highly customizable.

## Preview
![](https://github.com/TerryJung/SwipeAnimationButton/blob/master/preview.gif)


## How to use

### Install
**Step 1.** Add the JitPack repository to your build file

Add it in your **root build.gradle** at the end of repositories:
```
allprojects {
        repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
**Step 2.** Add the dependency
```
dependencies {
        implementation 'com.github.TerryJung:SwipeAnimationButton:0.1.0'
}
```

                   
### Setting up view
```
<com.terry.view.swipeanimationbutton.SwipeAnimationButton
        android:id="@+id/swipe_btn"
        android:layout_width="match_parent"
        android:layout_height="90dp"/>
```

### Use Swipe Listener
```
SwipeAnimationButton swipeAnimationButton = (SwipeAnimationButton) findViewById(R.id.swipe_btn);
        swipeAnimationButton.setOnSwipeAnimationListener(new SwipeAnimationListener() {
            @Override
            public void onSwiped(boolean isRight) {
                if (isRight) {
                    Toast.makeText(getApplicationContext(), "right Swipe!!!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "left Swipe!!!", Toast.LENGTH_LONG).show();
                }
            }
        });
```

### Customizing view
```
<com.terry.view.swipeanimationbutton.SwipeAnimationButton
        android:id="@+id/swipe_btn"
        android:layout_width="match_parent"
        android:layout_height="90dp"
	app:background="@drawable/shape_rounded"
        app:defaultBackground="@drawable/shape_button_neutral"
        app:defaultDrawable="@drawable/sentimental_neutral"
        app:rightSwipeBackground="@drawable/shape_button"
        app:rightSwipeDrawable="@drawable/sentimental_satisfied"
        app:leftSwipeBackground="@drawable/gradient_radius_grey"
        app:leftSwipeDrawable="@drawable/sentimental_dissatisfied"
	app:duration="200"/>
```

### To do
- Implementation custom method without XML


Lets contribute it!
