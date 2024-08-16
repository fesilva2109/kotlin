data class InfoApiShark(val title:String, val thumb:String){
    override fun toString(): String {
        return "Title: $title\n" +
                "Thumb: $thumb, )"
    }
}
