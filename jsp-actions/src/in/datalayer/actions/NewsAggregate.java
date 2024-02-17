package in.datalayer.actions;

import java.io.Serializable;

public class NewsAggregate implements Serializable {
	private String channelName;
	private String newsItem;

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getNewsItem() {
		return newsItem;
	}

	public void setNewsItem(String newsItem) {
		this.newsItem = newsItem;
	}

}
