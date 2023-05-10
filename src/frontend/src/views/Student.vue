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
         <v-btn @click="stergeStudent(1)" color="green">Delete</v-btn>
      </v-form>
      <br>
      <br>
      <br>
      <v-data-table :headers="headers" :items="tabel">
       </v-data-table>
    </v-responsive>
  </v-container>
</template>

<script>
import StudentService from "@/service/StudentService";

export default {
  name: "Student",
  data(){
    return {
      student: {
        nume: null,
        gen: null,
        varsta: null,
        medie: null
      },
      tabel: {
        nume: [],
        gen: [],
        varsta: [],
        medie: []
      },
      headers: [
        {title: 'Nume', key: 'nume'},
        {title: 'Gen', key: 'gen'},
        {title: 'Varsta', key: 'varsta'},
        {title: 'Medie', key: 'medie'}
      ],




    }
  },
created(){
this.getAllStudenti();

},

  methods: {
    salveazaStudent(){
      StudentService.postStudent(this.student)
    },
    stergeStudent(id){
      console.log("Hello")
      StudentService.deleteStudent(id)
    },
    getAllStudenti(){
     StudentService.getAllStudenti().then((response) => {
     this.tabel=response.data;
     })
    },

  },
}

</script>

<style scoped>

</style>
