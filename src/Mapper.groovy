class Mapper {
    static void main(args) {
        def hash = [name: "Andy", "VPN-#": 45]
        assert hash.getClass() == java.util.LinkedHashMap
        // 添加数据 方式一
        hash.put("id", 23)
        assert hash.get("name") == "Andy"
        // 添加数据 方式二
        hash.dob = "01/29/76"
        assert hash.dob == "01/29/76"
        // 使用假的位置语法将项放入映射，或者从映射获取项目
        assert hash["name"] == "Andy"
        hash["gender"] = "male"
        assert hash.gender == "male"
        assert hash["gender"] == "male"
        // 请注意，在使用 [] 语法从映射获取项时，必须将项作为 String 引用

        // 循环迭代
        hash.each{ key, value ->
            println "${key} : ${value}"
        }
    }
}
