package com.sizu.mingteng.my_xianglekang.global;

import android.content.Context;
import android.widget.ImageView;

import com.sizu.mingteng.my_xianglekang.App;
import com.sizu.mingteng.my_xianglekang.R;
import com.sizu.mingteng.my_xianglekang.util.glide.ImageUtils;
import com.sizu.mingteng.my_xianglekang.util.MyLogger;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by lenovo on 2017/6/1.
 */

public class GlideImageLoader extends ImageLoader {

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        /**
         注意：
         1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
         2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
         传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
         切记不要胡乱强转！
         */
        MyLogger.e("Glide",path+"===");
        //Glide 加载图片简单用法
      //  Glide.with(App.getContext()).load((String)path).into(imageView);
       /* Glide.with(App.getContext()).load((String)path)
                .placeholder(R.drawable.img_two_bi_one)
                .error(R.drawable.img_two_bi_one)
                .crossFade(1000)
                .into(imageView);*/
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageUtils.loadIntoUseFitWidth(App.getContext(),(String)path,R.drawable.img_two_bi_one,imageView);

        /*Glide.with(context).load((String)path)
                .placeholder(R.drawable.img_two_bi_one)
                .error(R.drawable.img_two_bi_one)
                .crossFade(1000)
                .into(imageView);*/
    }
}
