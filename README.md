# Jpotify - Advanced Java Music Streaming App

## Overview
Jpotify is a **Java-based desktop music streaming application** that replicates core functionalities of Spotify. It allows users to **stream, manage, and share music** while maintaining a user-friendly experience with advanced playback controls and social connectivity.

## Key Strengths
✅ **MP3 Playback Engine**: Implements `JavaLayer` to support **play, pause, resume, and seek** functionalities.
✅ **Dynamic Music Library**: Supports **custom playlists, favorite songs, and shared playlists**.
✅ **Real-time Social Features**: Uses **network sockets** for sharing music with friends, mimicking real-time collaborative listening.
✅ **Intelligent Sorting**: Includes a **custom song sorting system** (`SongComparator.java`) for structured music organization.
✅ **User-Friendly Desktop UI**: Features a **Swing-based graphical interface** for easy navigation and interaction.

## Features
- 🎵 **Music Library Management**: Import and organize songs into albums and playlists.
- 🔊 **Music Playback**: Play, pause, resume, and manage tracks.
- 👤 **User Accounts & Shared Playlists**: Each user has a unique music library and can share playlists.
- 🌐 **Networking & Social Features**: Connect with other users via sockets for shared music sessions.
- 🎨 **Album Artwork Support**: Albums include metadata and images.
- 🔍 **Custom Sorting**: Songs can be sorted intelligently using `SongComparator`.

## Installation
### Prerequisites
- Java 8 or later
- Maven (optional, if dependencies are added)

### Steps to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/your-repo/jpotify.git
   cd jpotify
   ```
2. Compile the Java files:
   ```sh
   javac -d bin src/Logic/*.java
   ```
3. Run the application:
   ```sh
   java -cp bin Logic.Main
   ```

## Usage
1. Modify `Main.java` to point to your local music folder.
2. Start the application and manage your playlists.
3. Use UI controls or terminal commands (`play`, `pause`) to control playback.
4. Share playlists with other users using the built-in **socket-based networking** feature.

## File Structure
```
Jpotify/
│── Logic/
│   ├── Main.java          # Entry point
│   ├── Library.java       # Manages song storage
│   ├── Client.java        # Handles user connections
│   ├── Song.java          # Implements MP3 playback and controls
│   ├── Playlist.java      # Custom playlists management
│   ├── SharedPlaylist.java # Social music sharing feature
│   ├── SongComparator.java # Intelligent song sorting
│── NetworkGraphics/
│   ├── PersonGUI.java     # Swing-based graphical UI
│── assets/                # Album artworks, icons
└── README.md
```

## Contributors
- **Kiana Hadysadegh** and **Mahshid Rahmani**.

## License
MIT License.

