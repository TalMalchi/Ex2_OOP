//package api;
//import api.StdDraw;
//import api.DirectedWeightedGraph;
//import  api.DirectedWeightedGraphAlgorithms;
//import api.EdgeData;
//import api.NodeData;
//import api.GeoLocation;
//import NodeDI;
//import Edge;
//import DirectedWeightedGraph_ans;
//import DirectedWeightedGraphAlgorithms_ans;
//import GeoLocation_class;
//import graphJsonDecoder;
//import utils.Range;
//
//
//import java.awt.Color;
//import java.util.Collection;
////import java.util.Iterator;
//
///**
// * this class represent a GUI for the graph, you can use it to draw random graph
// * or a graph of your own.
// * The gui is an extension of StdDraw library.
// * you can use the gui to draw a graph and use algorithms on it.
// * @authors Zohar Zrihen and Arthur Boltak.
// */
//public class Graph_Gui {
//    private DirectedWeightedGraph_ans graph;
//
//    public Graph_Gui() {
//        graph = (DirectedWeightedGraph_ans) graphCreator();
//
//    }
//
//    public static void main(String[] args) {
//        Graph_Gui gg = new Graph_Gui();
//        gg.DrawGraph(1000, 600, new Range(-10, 60), new Range(-10, 60),gg.getGr());
//        DirectedWeightedGraph_ans g=new DirectedWeightedGraph_ans();
//        g.addNode(new NodeDI(1,new GeoLocation_class(20,20,0)));
//        g.addNode(new NodeDI(2,new GeoLocation_class(30,30,0)));
//        g.connect(1,2,5);
//        g.connect(2,1,3);
//        Graph_Gui g1=new Graph_Gui(g);
//        DirectedWeightedGraph_ans g11=new DirectedWeightedGraph_ans();
//        Graph_Gui gg2=new Graph_Gui(g11);
//        // gg2.DrawGraph(1000, 600, new Range(-10, 60), new Range(-10, 60),gg2.getGr());
//    }
//
//    /**
//     * this is a default constructor which building a random graph using graph factory.
//     */
//
//
//    /**
//     * this constructor init graph g as the graph to draw.
//     * @param g graph to init and draw.
//     */
//    public Graph_Gui(DirectedWeightedGraph g) {
//        if(g==null ||g.nodeSize()==0){
//            g=new DirectedWeightedGraph_ans();
//        }
//        graph = new DirectedWeightedGraph_ans((DirectedWeightedGraph_ans) g);
//    }
//
//    /**
//     * this function draws the graph you send to, using StdDraw library.
//     * @param w width of the canvas
//     * @param h height of the canvas
//     * @param rx range of x axis
//     * @param ry range of y axis
//     * @param g the graph you want to draw.
//     */
//    public void DrawGraph(int w, int h, Range rx, Range ry, DirectedWeightedGraph g) {
//        if(g==null||g.nodeSize()==0){
//            g= new DirectedWeightedGraph_ans();
//
//        }
//
//        StdDraw.setgraph(g);
//        StdDraw.setCanvasSize(w, h);
//        StdDraw.setXscale(rx.get_min(), rx.get_max());
//        StdDraw.setYscale(ry.get_min(), ry.get_max());
//        Collection<node_data> nodes = gr.getV();
//        Iterator iter = nodes.iterator();
//        while (iter.hasNext()) {
//            node n = (node) iter.next();
//            StdDraw.setPenColor(Color.BLACK);
//            StdDraw.setPenRadius(0.02);
//            StdDraw.point(n.getLocation().x(), n.getLocation().y());
//            int key = n.getKey();
//            StdDraw.text(n.getLocation().x() - 1, n.getLocation().y() + 1, Integer.toString(key));
//            Collection<edge_data> edges = gr.getE(n.getKey());
//            Iterator iterE = edges.iterator();
//            while (iterE.hasNext()) {
//                edge e = (edge) iterE.next();
//                StdDraw.setPenColor(Color.RED);
//                StdDraw.setPenRadius(0.007);
//                Point3D p1 = gr.getNode(e.getSrc()).getLocation();
//                Point3D p2 = gr.getNode(e.getDest()).getLocation();
//                StdDraw.line(p1.x(), p1.y(), p2.x(), p2.y());
//                StdDraw.setPenColor(Color.BLUE);
//                StdDraw.text((p1.x() + p2.x()) / 2, ((p1.y() + p2.y()) / 2) + 1.5, Double.toString(e.getWeight()));
//                StdDraw.setPenColor(Color.YELLOW);
//                StdDraw.setPenRadius(0.02);
//                StdDraw.point(p1.x() + 0.85 * (p2.x() - p1.x()), p1.y() + 0.85 * (p2.y() - p1.y()));
//
//            }
//        }
//        StdDraw.save("MyGraph.jpg");
//    }
//
//    /**
//     * this is a graph factory to draw a random graph.
//     * the random graph has 10 vertices in random location.
//     * @return
//     */
////    public DGraph GraphFactory() {
////        DGraph gr = new DGraph();
////        for (int i = 1; i < 11; i++) {
////            gr.addNode(new node(i, new Point3D((int) (Math.random() * 50) + 1, (int) (Math.random() * 50) + 1, 0)));
////        }
////        for (int i = 1; i < 9; i++) {
////            gr.connect(i, i + 1, (int) (Math.random() * 20) + 1);
////            gr.connect(i, i + 2, (int) (Math.random() * 20) + 1);
////        }
////        return gr;
////    }
//
//    public DGraph getGr(){
//        return (DGraph) gr;
//    }
//
//
//    public DirectedWeightedGraph graphCreator(){
//        GeoLocation_class GeoLoc = new GeoLocation_class(1,2,3);
//
//        NodeData n0= new NodeDI(0);
//        NodeData n1= new NodeDI(1);
//        NodeData n2= new NodeDI(2);
//        NodeData n3= new NodeDI(3);
//        NodeData n4= new NodeDI(4);
//        NodeData n5= new NodeDI(5);
//        NodeData n6= new NodeDI(6);
//        NodeData n7= new NodeDI(7);
//        NodeData n8= new NodeDI(8);
//        NodeData n9= new NodeDI(9);
//        NodeData n10= new NodeDI(10);
//
//        DirectedWeightedGraph g1= new DirectedWeightedGraph_ans();
//        g1.addNode(n0);
//        g1.addNode(n1);
//        g1.addNode(n2);
//        g1.addNode(n3);
//        g1.addNode(n4);
//        g1.addNode(n5);
//        g1.addNode(n6);
//        g1.addNode(n7);
//        g1.addNode(n8);
//        g1.addNode(n9);
//        g1.addNode(n10);
//
//        g1.connect(n1.getKey(),n2.getKey(),3.0);
//        g1.connect(n1.getKey(),n3.getKey(),1);
//        g1.connect(n3.getKey(),n2.getKey(),1);
//        g1.connect(n0.getKey(),n2.getKey(),4.5);
//        g1.connect(n0.getKey(),n4.getKey(),1);
//        g1.connect(n4.getKey(),n5.getKey(),0.5);
//        g1.connect(n5.getKey(),n6.getKey(),8);
//        g1.connect(n7.getKey(),n1.getKey(),0.5);
//        g1.connect(n8.getKey(),n0.getKey(),3.5);
//        g1.connect(n9.getKey(),n5.getKey(),11);
//        g1.connect(n6.getKey(),n9.getKey(),5);
//        g1.connect(n9.getKey(),n4.getKey(),9);
//        g1.connect(n4.getKey(),n8.getKey(),10);
//        g1.connect(n3.getKey(),n7.getKey(),6);
//        g1.connect(n2.getKey(),n1.getKey(),4);
//        g1.connect(n3.getKey(),n6.getKey(),30);
//        g1.connect(n10.getKey(),n6.getKey(),2);
//
//        return g1;
//    }
//}