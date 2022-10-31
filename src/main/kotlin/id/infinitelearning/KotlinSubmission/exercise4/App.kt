package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

        try {
            val result = 24 / 3 // exception terjadi disini
            println("The result: $result")
        } catch (e: Exception) {
            // menampilkan pesan exception
            println("Error occurred: ${e.message}")
        }
    }