### GraphvizOuts使用总结
#### 安装、创建、运行：
* `brew install graphvize`
* `vi *.dot`
* `dot  *.dot -T png|jpg|pdf|etc -o ~/XX.png|jpg|pdf|etc`
#### Tips:
* 使用Atom language-dot和graphviz-preview插件可以预览结果
#### 语法
* dot使用graph|dirgraph,node,edge来描述流程图
* graph:无向图; dirgraph:有向图;subgraph:子图
* 子图和“父类图”设置一样但是要用cluster来修饰图的名字
#### 图属性：
* bgcolor：背景色 `bgcolor="#F6666"`
* rankdir：节点顺序默认为TB(由上到下)，可以设置为LR,RL
* rank：设置节点排序(same,max,min,source)`{rank=same;node1,node2}`
* nodesep:节点间隔(默认为左右间隔)
* ranksep:上下间隔
* fontsize:字体大小
* margin:
* labeljust:调整图或子图的左右位置
* labelloc:调整图或子图的上下位置

#### node属性：
* shape:节点的形状`shape=box|record|eclipse|plaintext|none`
* label:显示的名字,支持`\n`换行
* style:样式,目前用到最多的是invis
* fillcolor:填充样式(当style为filled时有效,[填充颜色](https://blog.csdn.net/geecky/article/details/51912111))
* 

#### 流程图
* `a -- b`无向图
* `a --{b,c,d}`同时指向abc
* `a -> b:head[label=“”,style="",color="",arrayhead="",dir="both|back|forward"`
* 可以指定从[哪个方向](https://blog.csdn.net/gyj072001/article/details/78350077)指向b;
* 可以用`{}`统一设置多个节点相同的属性;
* 节点支持html风格：
``` 
//可以使用NodeName:PORT对节点进行调用
digraph html {
    HTML[shape=none, margin=0, label=<
    <TABLE >
        <TR><TD ROWSPAN="3"><FONT COLOR="red">hello</FONT><BR/>world</TD>
            <TD COLSPAN="3">b</TD>
            <TD ROWSPAN="3" BGCOLOR="lightgrey">g</TD>
            <TD ROWSPAN="3">h</TD>
        </TR>
        <TR><TD>c</TD>
            <TD PORT="here">d</TD>
            <TD>e</TD>
        </TR>
        <TR><TD COLSPAN="3">f</TD></TR>
    </TABLE>>];
}
```
* 绘制二叉树：
```
digraph btree{
    node [shape="record", height=.1];
    node0[label="<f0> |<f1> G|<f2>"];
    node1[label="<f0> |<f1> E|<f2>"];
    node2[label="<f0> |<f1> B|<f2>"];
    node0:f0 -> node1:f1;
    node0:f2 -> node2:f1;
}//其中，用|隔开的串会在绘制出来的节点中展现为一条分隔符，用<>括起来的串称为锚点。
```
* [不同箭头形状](https://wenku.baidu.com/view/be4a0bf32cc58bd63186bd5c.html)

### 参考链接：
* 1:https://blog.csdn.net/sd10086/article/details/52979462;
* 2:http://www.360doc.com/content/16/0121/23/30281360_529674653.shtml#
* 3:https://github.com/miloyip/game-programmer/blob/master/game-programmer.dot


