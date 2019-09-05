package modul;

/**
 * Created with IDEA
 * author:LiLan
 * Date:2019/5/2
 * Time:19:19
 * Introduction:
 */
public class Goods {
    private String goodsId;
    private String goodsName;
    private String price;
    private String type;
    private String amount;
    private String describe;
    private String releaser;

    public Goods(String goodsId, String goodsName, String price, String type, String amount, String describe, String releaser) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
        this.type = type;
        this.amount = amount;
        this.describe = describe;
        this.releaser = releaser;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getReleaser() {
        return releaser;
    }

    public void setReleaser(String releaser) {
        this.releaser = releaser;
    }
}
