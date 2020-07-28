# Music Structure Application

# Udcaity Google Android Basic Nanodegree

## Project Specification

1 The app's structure is suitable for a music player app. A similarly structured app which focuses on audiobooks, podcasts, or other audio media is also acceptable.

2 The purpose of each activity is easy for a user to understand through the UI design and feature labeling.

3 The app contains 2 to 6 activities

4 Each activity c
ontains button(s) which link it to other activities a user should be able to reach from that activity. For instance, a 'Library' activity might contain a button to move to the 'Now Playing' activity.

5 The code adheres to all of the following best practices
* Text sizes are defined in sp

* Lengths are defined in dp

* Padding and margin is used appropriately, such that the views are not crammed up against each other.

6 Each button's behavior is determined by an OnClickListener in the Java code rather than by the android:onClick attribute in the XML Layout.

7 Each button properly opens the intended activity using an explicit Intent.

8 App uses a custom adapter to populate the layout with views based on instances of the custom class.

9  Data about each song (or equivalent audio media such as podcast episode) should be stored in a
custom class that contains at least 2 states (e.g. Song Name, Artist Name)

10 If images are included (e.g. Album Art), they are stored as drawables. All drawables are stored at multiple densities. Images are not required.

11 A
ll variables, methods, and resource IDs are descriptively named so that another developer reading the code can easily understand their function.

### App Design

App contains five  activities

* My Playlist

* Artist

* Now Playing

* Main Activity

App is using Song.java as Custom class

Custom Array Adapter is Playlist Adapter

**App only provides structre of music  app .No media player functionality has been added**
