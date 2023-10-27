package senac.java.Domain;

import org.json.JSONObject;

import java.util.List;

public class Salesperson {
    int id = 0;

    public String pImg = "";
    public  String pName = "";
    public  String pPrice = "";
    public  String pDescri = "";

    public Salesperson(){

    }

    public Salesperson(String pImg,String pName,String pPrice,String pDescri) {
        this.pImg = pImg;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pDescri = pDescri;
    }

    public String getpImg() {
        return pImg;
    }

    public void setpImg(String pImg) {
        this.pImg = pImg;
    }


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpPrice() {
        return pPrice;
    }

    public void setpPrice(String pPrice) {
        this.pPrice = pPrice;
    }

    public String getpDescri() {
        return pDescri;
    }

    public void setpDescri(String pDescri) {
        this.pDescri = pDescri;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
                json.put("getpImg",pImg);
                json.put("pName", pName);
                json.put("pPrice", pPrice);
                json.put("pDescri",pDescri);

                return json;
    }

    public JSONObject arrayToJson(List<Salesperson> salespersonList) {
        JSONObject json = new JSONObject();
        if(!salespersonList.isEmpty()) {
            var keyJson = 0;
            for (Salesperson salesperson :salespersonList) {
                JSONObject jsonFor = new JSONObject();

                jsonFor.put("pImg", salesperson.getpImg());
                jsonFor.put("pName", salesperson.getpName());
                jsonFor.put("pPrice", salesperson.getpPrice());
                jsonFor.put("pDescri",salesperson.getpDescri());

                json.put(String.valueOf(keyJson),jsonFor);
                keyJson++;
            }
            return json;
        } else {
            return null;
        }


    }

    public static Salesperson getSalesPerson(int index, List<Salesperson> salespersonList) {
        if(index >= 0 && index < salespersonList.size())  {

            return salespersonList.get(index);

        }

        else{
            return null;
        }

    }

    public static List<Salesperson> getAllSalesPerson(List<Salesperson> salespersonList) {
        return salespersonList;
    }
}



