//// quick_menu.xml 을 위한 리스트뷰 자바 파일
//
//package kr.ac.hs.and2021.myapplication;
//
//import android.content.Context;
//import android.graphics.drawable.Drawable;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//public class ListItemAdapter extends BaseAdapter {
//
//    Context context;
//
//    // Adapter에 추가된 데이터를 저장하기위한 ArrayList
//    ArrayList<List> items = new ArrayList<List>();
//
//    // ListItemAdapter 생성자
//    public ListItemAdapter(){}
//
//    // Adapter에 사용되는 데이터의 개수를 리턴하는 함수
//    @Override
//    public int getCount() {
//        return items.size();
//    }
//
//    // 지정한 위치에 있는 데이터를 리턴하는 함수
//    @Override
//    public Object getItem(int position) {
//        return items.get(position);
//    }
//
//    // 지정한 위치에 있는 데이터와 관계된 아이템의 id를 리턴하는 함수
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    // 아이템 데이터 추가를 위한 함수.
//    public void addItem(List item){
//        items.add(item);
//    }
//
//    //position에 위치한 데이터를 화면에 출력하는데 사용되는 뷰를 리턴하는 함수
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        List listItem = items.get(position);
//        context = parent.getContext();
//
//        //listview_item layout을 inflate하여 convertView 참조 획득
//        if(convertView == null){
//            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = inflater.inflate(R.layout.listview_item, parent, false);
//        }
//        // 화면에 표시될 View(Layout이 inflate된)로부터 위젯에 대한 참조 획득
//        ImageView imageTitle = (ImageView) convertView.findViewById(R.id.imageView);
//        TextView mainTitle = (TextView) convertView.findViewById(R.id.mainTitle);
//        TextView subTitle = (TextView) convertView.findViewById(R.id.subTitle);
//
//        // Data set(listViewItemList)에서 position에 위치한 데이터 참조 획득
//        List listViewItem = items.get(position);
//
//        // 아이템 내 각 위젯에 데이터 반영
//        mainTitle.setText(listItem.getTitle());
//        subTitle.setText(listItem.getDesc());
//
//        return convertView;
//    }
//
//}
