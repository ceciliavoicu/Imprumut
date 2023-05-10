<template>
  <v-container>
    <v-responsive>
      <v-form>
        <v-card>
          <v-card-title>Student</v-card-title>
          <v-text-field v-model="student.nume" label="Nume"></v-text-field>
          <v-select :items="genuri" v-model="student.gen" label="Gen"></v-select>
          <v-text-field v-model="student.varsta" label="Varsta"></v-text-field>
          <v-text-field v-model="student.medie" label="Medie"></v-text-field>
        </v-card>
        <v-btn @click="salveazaStudent" color="green">Submit</v-btn>
      </v-form>
      <br>
      <br>
      <br>
      <v-data-table :headers="headers" :items="tabel">
      <template v-slot:item.actions="{item}">
      <v-icon @click="stergeStudent(item.raw.id)">mdi-delete
      </v-icon>
      </template>
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
      tabel: [{
        id:[],
        nume: [],
        gen: [],
        varsta: [],
        medie: []
      }],
      headers: [
        {title: 'Id', key: 'id'},
        {title: 'Nume', key: 'nume'},
        {title: 'Gen', key: 'gen'},
        {title: 'Varsta', key: 'varsta'},
        {title: 'Medie', key: 'medie'},
        {title: 'Actions', key: 'actions'}
      ],
      genuri: [ 'Masculin', 'Feminin'],

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
