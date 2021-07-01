package com.google;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() throws IOException {
	FileReader fr;
	try {
		fr = new FileReader("./src/main/resources/videos.txt");
		int i;    
	      while((i=fr.read())!=-1)    
	      System.out.print((char)i);    
	      fr.close();  
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
  }

  public void playVideo(String videoId) {
	  ProcessBuilder pb;
    	  pb = new ProcessBuilder("C:\\Program Files\\Windows Media Player\\wmplayer.exe","C:\\Users\\Google\\Desktop\\internship\\funnyDog.mp4");
    	  try {
    		pb.start();
    		System.out.println("Playing video: " + videoId);
    	} catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	 
    	   /*String musicLocation = "C:\\Users\\Google\\Desktop\\internship\\funny-dog-song.mp3";
    	try {
    		File musicPath = new File(musicLocation);
    		
    		if(musicPath.exists()) {
    			System.out.println("cant find file");
    		}
    		else {
    			AudioInputStream audio = new AudioSystem.getAudioInputStream(musicPath);
    			Clip clip = AudioSystem.getClip();
    		}
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null,"Error");
    	}*/
  }

  public void stopVideo() {
  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}