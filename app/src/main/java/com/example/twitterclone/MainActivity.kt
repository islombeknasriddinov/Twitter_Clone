package com.example.twitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.twitterclone.adapter.FeedAdapter
import com.example.twitterclone.adapter.StoryAdapter
import com.example.twitterclone.model.Post
import com.example.twitterclone.model.Story

class MainActivity : AppCompatActivity() {
    lateinit var recyclerStory: RecyclerView
    lateinit var recyclerFeed: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        recyclerFeed = findViewById(R.id.recyclerFeed)
        val manager1 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerFeed.setLayoutManager(manager1)

        recyclerStory = findViewById(R.id.recyclerStory)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerStory.setLayoutManager(manager)

        refreshStoryAdapter(getAllStory())
        refreshFeedAdapter(getAllFeeds())
    }

    private fun getAllFeeds(): ArrayList<Post> {
        val feeds: ArrayList<Post> = ArrayList<Post>()

        var str: String =
            "https://images.unsplash.com/photo-1644910595529-1075df35cff5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80"
        var str1: String =
            "https://images.unsplash.com/photo-1644869314419-44700548bd92?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"
        var str2: String =
            "https://images.unsplash.com/photo-1644091082395-5b8b8e1555e2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=327&q=80"
        var str3: String =
            "https://images.unsplash.com/photo-1644164935217-46328ef58943?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"
        var str4: String =
            "https://images.unsplash.com/photo-1643277227040-1919439d29c2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=436&q=80"
        var str5: String =
            "https://images.unsplash.com/photo-1642411765685-e291ac9b96f3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=366&q=80"
        var str6: String =
            "https://images.unsplash.com/photo-1641096179465-52e208f6dc49?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=435&q=80"
        var str7: String =
            "https://images.unsplash.com/photo-1644463589256-02679b9c0767?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=580&q=80"
        var str8: String =
            "https://images.unsplash.com/photo-1644447295446-19b7e712a895?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"
        var str9: String =
            "https://images.unsplash.com/photo-1644784960532-7a3d7195e26a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=465&q=80"
        var str10: String =
            "https://images.unsplash.com/photo-1617886337523-4dcbb15230a2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80"
        var str11: String =
            "https://images.unsplash.com/photo-1644249885405-f93979865ece?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1031&q=80"
        var str12: String =
            "https://images.unsplash.com/photo-1601068079900-7e1e18c896b7?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"
        var str13: String =
            "https://images.unsplash.com/photo-1640957507202-6e5ad7cd3365?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=425&q=80"
        var str14: String =
            "https://images.unsplash.com/photo-1643937583754-ee8aa3d5ccd2?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80"

        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str1))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str3))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str2))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str4))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str6))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str5))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str7))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str10))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str8))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str9))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str14))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str11))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str13))
        feeds.add(Post(R.drawable.profile, "Islombek Nasriddinov", str12))


        return feeds
    }

    private fun refreshFeedAdapter(feeds: ArrayList<Post>) {
        var adapter = FeedAdapter(this, feeds)
        recyclerFeed!!.adapter = adapter
    }

    private fun getAllStory(): ArrayList<Story> {
        val story: ArrayList<Story> = ArrayList<Story>()

        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))
        story.add(Story(R.drawable.profile, "Islombek Nasriddinov"))

        return story
    }

    private fun refreshStoryAdapter(story: ArrayList<Story>) {
        var adapter = StoryAdapter(this, story)
        recyclerStory!!.adapter = adapter
    }
}