class Ranger {
    static void main(args) { // main函数
//        def range = 0..4 // 范围作为集合
//        println range.class
//        assert range instanceof List // assert 命令用来证明范围是 java.util.List 的实例

        def range = [1, 2, 3, 4]
        // assert断言用来判断条件真假，如果是真继续往下走，如果是假，程序终止
        assert range + 5 == [1, 2, 3, 4, 5]
        assert range - [2, 3] == [1, 4]
        assert range.join(",") == "1,2,3,4"
        assert [1, 2, 3, 4, 3].count(3) == 2
        assert ["JAVA", "GROOVY"] == ["Java", "Groovy"]*.toUpperCase()

        println range.size()
        for (def i : range) {
            println i
        }

        def coll = ["Groovy", 1, range]
        assert coll instanceof Collection
        assert coll instanceof ArrayList
        // 添加方式
        coll.add("Python")
        coll << "Smalltalk"
        coll[5] = "Perl"

        // 闭包循环
        coll.each { value ->
//            println it
            println value // 可以用自定义名称代替默认的it
        }
        //  定义一个闭包
        def excite = { word ->
            return "${word}!!"
        }
        // 调用闭包
        assert "Groovy!!" == excite("Groovy")
        assert "Java!!" == excite.call("Java")

        // 集合和数组都是从 0 开始
        for (def i = 0; i < coll.size(); i++) {
//            println coll[i]
        }
//        for(def str : coll){
//            println str
//        }

        // 凡是集合或一系列的内容，都可以使用下面这样的代码进行迭代
        "ITERATION".each{
            println it.toLowerCase()
        }
    }
}
