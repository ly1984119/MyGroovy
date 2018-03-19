package bean

class Song {
    def name
    def artist
    def genre

    // 覆盖自动生成的get方法
    def getGenre() {
        genre?.toUpperCase() // ?用来避免空指针
    }

    String toString() {
        "${name}, ${artist}, ${genre}"
    }

    // 方法参数是Map,key-value取值
    static void create(mapper) {
        println mapper.name + mapper.type
    }
}
