////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by FernFlower decompiler)
////
//
//package api;
//
////import api.DS_DWGraph.Edge_data;
////import api.DS_DWGraph.Node_data;
//import com.google.gson.JsonDeserializationContext;
//import com.google.gson.JsonDeserializer;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParseException;
//import java.lang.reflect.Type;
//import java.util.Iterator;
//import java.util.Map.Entry;
//
//public class jsonnn implements JsonDeserializer<DirectedWeightedGraph> {
//    public graphJsonDecoder() {
//    }
//
//    public DirectedWeightedGraph deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
//        DirectedWeightedGraph_ans temp = new DirectedWeightedGraph_ans();
//        JsonObject jsonObj = jsonElement.getAsJsonObject();
//        JsonObject Verticals = jsonObj.get("V").getAsJsonObject();
//        Iterator var7 = Verticals.entrySet().iterator();
//
//        while(var7.hasNext()) {
//            Entry<String, JsonElement> set = (Entry)var7.next();
//            String hashKey = (String)set.getKey();
//            JsonElement nodeValue = (JsonElement)set.getValue();
//            int key = nodeValue.getAsJsonObject().get("key").getAsInt();
//            int tag = nodeValue.getAsJsonObject().get("tag").getAsInt();
//            String info = nodeValue.getAsJsonObject().get("info").getAsString();
//            double weight = nodeValue.getAsJsonObject().get("node_weight").getAsDouble();
//            NodeData n = new NodeDI()key, tag, weight, info);
//            temp.addNode(n);
//        }
//
//        JsonObject Edges = jsonObj.get("E").getAsJsonObject();
//        Iterator var23 = Edges.entrySet().iterator();
//
//        while(var23.hasNext()) {
//            Entry<String, JsonElement> set = (Entry)var23.next();
//            String edgeKey = (String)set.getKey();
//            JsonObject current = Edges.get((String)set.getKey()).getAsJsonObject();
//            Iterator var27 = current.entrySet().iterator();
//
//            while(var27.hasNext()) {
//                Entry<String, JsonElement> set2 = (Entry)var27.next();
//                JsonElement edgeValue = (JsonElement)set2.getValue();
//                int src = edgeValue.getAsJsonObject().get("src").getAsInt();
//                int dest = edgeValue.getAsJsonObject().get("dest").getAsInt();
//                double weight = edgeValue.getAsJsonObject().get("weight").getAsDouble();
//                String info = edgeValue.getAsJsonObject().get("info").getAsString();
//                int tag = edgeValue.getAsJsonObject().get("tag").getAsInt();
//                new Edge_data(src, dest, weight, info, tag);
//                temp.connect(src, dest, weight);
//            }
//        }
//
//        return temp;
//    }
//}
