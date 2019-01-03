RailItem

1、功能描述
RailItem是一个功能强大的View，可以满足日常横条布局样式，开发者可已自行组合属性配置出属于自己风格的样式!可能描述起来没有概念，还是直接看效果图吧！


2、属性描述
    <declare-styleable name="RailItemView">
        <!-- l 表示左边 -->
        <attr name="l_left_drawable" format="reference" />
        <attr name="l_top_drawable" format="reference" />
        <attr name="l_right_drawable" format="reference" />
        <attr name="l_bottom_drawable" format="reference" />
        <attr name="l_padding" format="dimension" />
        <!-- r 表示右边 -->
        <attr name="r_left_drawable" format="reference" />
        <attr name="r_top_drawable" format="reference" />
        <attr name="r_right_drawable" format="reference" />
        <attr name="r_bottom_drawable" format="reference" />
        <attr name="r_padding" format="dimension" />
        <!-- 左边文字 -->
        <attr name="left_label" format="string" />
        <!-- 右边文字 -->
        <attr name="right_label" format="string" />
        <!-- 左边文字大小 -->
        <attr name="left_size" format="dimension" />
        <!-- 右边文字大小 -->
        <attr name="right_size" format="dimension" />
        <!-- 左边文字颜色 -->
        <attr name="left_color" format="color" />
        <!-- 右边文字颜色 -->
        <attr name="right_color" format="color" />
        <!-- 内部填充 -->
        <attr name="inner_padding" format="dimension" />
        <!-- 底部划线 -->
        <attr name="is_line" format="boolean" />
        <!-- 底部划线边距 -->
        <attr name="line_margin" format="dimension" />
        <!-- 底部划线宽度 -->
        <attr name="line_width" format="dimension" />
        <!-- 底部划线颜色 -->
        <attr name="line_color" format="color" />
    </declare-styleable>
    
    
3.如何使用
  3.1xml
  
   <com.liuzq.railitem.RailItemView
        android:id="@+id/rail_item_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:inner_padding="20dp"
        app:is_line="true"
        app:l_padding="20dp"
        app:l_left_drawable="@mipmap/ic_launcher"
        app:left_color="@color/colorAccent"
        app:left_label="左边"
        app:left_size="16sp"
        app:line_color="@color/colorAccent"
        app:line_margin="10dp"
        app:line_width="1px"
        app:r_right_drawable="@mipmap/ic_launcher"
        app:r_padding="10dp"
        app:right_color="@color/colorPrimary"
        app:right_label="右边"
        app:right_size="20sp" />    
            
  3.2代码链式
    /**
     * 可以通过链式设置大部分常用的属性值
     */
   itemView.setLeftColor(getResources().getColor(android.R.color.black))
           .setLeftSize(75f)
           .setLeftText("换字")
           .isLineView(true)
           .setLineColor(getResources().getColor(R.color.red))
           .setLineParams(50, 10)
           .setListener(this);
     
                
