import java.util.HashMap;

//535. Encode and Decode TinyURL
public class Codec {

    HashMap<Integer, String> map = new HashMap<>();
    int count = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(count, longUrl);
        return "http://tinyurl.com/" + count++;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String replace = shortUrl.replace("http://tinyurl.com/", "");
        return map.get(Integer.parseInt(replace));
    }

    }
