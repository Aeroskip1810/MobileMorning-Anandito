package id.infinitelearning.KotlinSubmission.exercise1

/*Latihan 1*/


fun myProfile() {
    val namaDepan = "Anandito"
    val namaBelakang = "Indrasmara Wijaya"
    val namaPanggilan = "Dito Aja"
    val umur = 21
    val statusSaya = "Mahasiswa"
    val statusSekarang = "Mahasiswa"

    println("Nama = " + namaDepan + " " + namaBelakang)
    println("Nama Panggilan = " + namaPanggilan)
    println("Umur = " + umur)
    println("Status Saya = " + statusSekarang)

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    val groupId = 7
    val groupMember = "TanyaDoc"
    val session = "Kelas Pagi"

    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val anggotaKelompok = listOf("Farizal Salman","Hardiansah Ginting","Anandito Indrasmara","Fadila Khairunisa","Heni Fransiska")

    return anggotaKelompok[2]
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5

    return mentor.count() + countOfGroup

}

fun main() {

    myProfile()

    val myName = myName()
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail(1, listOf("Farizal Salman", "Hardiansah Ginting", "Anandito Indrasmara", "Fadila Khairunisa", "Heni Fransiska"), "Morning")

}