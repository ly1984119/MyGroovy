class TestGroovy { // 类名
    static void main(args) { // main函数
        def message = "test print" // 定义变量
        println message

        repeat("hello world")

        repeat2("hello my world",2) // 方法调用
    }

    static def repeat(val) { // 方法定义
        for (i in 0..4) {
            println val + i
        }
    }

    static def repeat2(val, repeat = 5) { // 不给第二个参数的话，默认值是5
        for (i in 0..<repeat) {
            println val
        }
    }
}
