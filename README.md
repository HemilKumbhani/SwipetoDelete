"# SwipetoDelete" 
This is very small and simple demo. This is very easily understand by beginner.

To implement Swipe Delete functionality. Follow below steps
1) Implement below library into build.gradle of app.

compile "com.daimajia.swipelayout:library:1.2.0@aar"

2) Use layout of swipe where you want to swipe list.
In this demo, I have implemented in item_your_news_feeds.xml
<com.daimajia.swipe.SwipeLayout>
....your layout
</<com.daimajia.swipe.SwipeLayout>

3) To delete item see SwipeRecyclerAdapter.java

Screenshots are attached here.
