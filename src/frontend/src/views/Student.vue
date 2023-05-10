<template>
  <v-container>
    <v-responsive>
      <v-form>
        <v-card>
          <v-card-title>Student</v-card-title>
          <v-text-field v-model="student.nume" label="Nume"></v-text-field>
          <v-text-field v-model="student.gen" label="Gen"></v-text-field>
          <v-text-field v-model="student.varsta" label="Varsta"></v-text-field>
          <v-text-field v-model="student.medie" label="Medie"></v-text-field>
        </v-card>
        <v-btn @click="salveazaStudent" color="green">Submit</v-btn>
      </v-form>
    </v-responsive>
  </v-container>
</template>

<script>
import StudentService from "@/service/StudentService";

export default {
  name: "Student",
  data(){
    return {
      carte: {
        nume: null,
        gen: null,
        varsta: null,
        medie: null
      },

    }
  },

  methods: {
    salveazaStudent(){
      StudentService.postStudent(this.student)
    },
    stergeStudent(){
      StudentService.postStudent(this.id)
    },
  },
}

</script>

<style scoped>

</style>
