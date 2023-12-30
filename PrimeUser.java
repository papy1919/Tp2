class PremiumUser implements IUser {

    protected String userName;
    protected PlayList myPlayList;

    public PremiumUser(String userName, String myPlayListName){
        this.userName = userName;
        this.myPlayList = new PlayList(myPlayListName);
    }

    @Override
    public void listen(Song song) {
        System.out.println("User " + userName + " is listening to " + song.getTitle());
    }

    @Override
    public void addToCustomPlaylist(Song song) {
        System.out.println("Song " + song.getTitle() + " is added to " + userName + "'s playlist");
        myPlayList.addSongToPlaylist(song);
    }

    public void showCustomPlaylist(){
        myPlayList.listAllSongs();
    }
}