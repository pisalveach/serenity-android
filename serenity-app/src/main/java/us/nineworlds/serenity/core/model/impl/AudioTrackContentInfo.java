/**
 * The MIT License (MIT)
 * Copyright (c) 2012 David Carver
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
 * OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF
 * OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package us.nineworlds.serenity.core.model.impl;

import us.nineworlds.serenity.core.model.TrackContentInfo;

/**
 * @author dcarver
 *
 */
public class AudioTrackContentInfo implements TrackContentInfo {
	
	private String id;
	private String summary;
	private String backgroundURL;
	private String albumImageURL;
	private String title;
	private String mediaTagIdentifer;
	private String audioChannels;
	private String originalAirDate;
	private int duration;
	private String year;
	private String parentImageURL;
	private String grandparentImageURL;
	private String directPlayURL;

	@Override
	public String id() {
		return id;
	}

	@Override
	public String getSummary() {
		return summary;
	}

	@Override
	public String getBackgroundURL() {
		return backgroundURL;
	}

	@Override
	public String getImageURL() {
		return albumImageURL;
	}

	@Override
	public String getTitle() {
		
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void setImageURL(String imageURL) {
		this.albumImageURL = imageURL;
	}

	@Override
	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public void setBackgroundURL(String backgroundURL) {
		this.backgroundURL = backgroundURL;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getMediaTagIdentifier() {
		return mediaTagIdentifer;
	}

	@Override
	public void setMediaTagIdentifier(String mediaTagIdentifier) {
		this.mediaTagIdentifer = mediaTagIdentifier;
	}

	@Override
	public String getAudioChannels() {
		return audioChannels;
	}

	@Override
	public void setAudioChannels(String audioChannels) {
		this.audioChannels = audioChannels;
	}

	@Override
	public void setOriginalAirDate(String airDate) {
		this.originalAirDate = airDate;
	}

	@Override
	public String getOriginalAirDate() {
		return originalAirDate;
	}

	@Override
	public void setDuration(int duration) {
		this.duration = duration;
		
	}

	@Override
	public int getDuration() {
		return duration;
	}

	@Override
	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String getParentPosterURL() {
		return parentImageURL;
	}

	@Override
	public String getGrandParentPosterURL() {
		return grandparentImageURL;
	}

	@Override
	public String getDirectPlayUrl() {
		return directPlayURL;
	}

	@Override
	public void setDirectPlayUrl(String directPlayUrl) {
		this.directPlayURL = directPlayUrl;
	}

	@Override
	public String getYear() {
		return year;
	}

	@Override
	public void setParentPosterURL(String parentPosterURL) {
		this.parentImageURL = parentPosterURL;
	}

	@Override
	public void setGrandParentPosterURL(String grandparentURL) {
		this.grandparentImageURL = grandparentURL;
	}

}