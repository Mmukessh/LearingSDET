package OOPS;


enum URL {

    API("http://api.com"),
    katlon("http://katlon.com");

    private String url;

    URL(String url) {
        this.url = url;
    }

    String geturl()
    {
        return this.url;

    }
}
