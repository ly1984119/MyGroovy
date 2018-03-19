import bean.Song

class SongExample {
    static void main(args) {
        // 自动生成了构造函数
        def sog = new Song(name: "Le Freak", artist: "Chic", genre: "Disco")

        // 不必为所有属性赋值
        def sng2 = new Song(name:"Kung Fu Fighting")
        // 打印对象
        println sng2
        assert sng2.genre == null
        println sng2.artist?.toUpperCase() // ?可避免空指针，减少判断

        // 点属性方式设置属性值
        def sng3 = new Song()
        sng3.name = "Funkytown"
        sng3.artist = "Lipps Inc."
        sng3.setGenre("Disco")
        // 调用方法可省略括号
        sng3.setGenre "Disco"
        // 自动生成了get和set方法
        assert sng3.getArtist() == "Lipps Inc."
        assert sng3.genre == "DISCO"
        // 打印对象
        println sng3
        // 方法参数是Map
        sng3.create(name:  "hahaha:",type:  "wo zui niu");
    }
}
