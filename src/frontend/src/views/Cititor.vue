<template>
  <v-container>
    <v-responsive>
      <v-form>
        <v-card>
          <v-card-title>Cititor</v-card-title>
          <v-text-field v-model="cititor.nume" label="Nume"></v-text-field>
          <v-text-field v-model="cititor.prenume" label="Prenume"></v-text-field>
          <v-text-field v-model="cititor.adresa" label="Adresa"></v-text-field>
          <v-text-field v-model="cititor.nrTelefon" label="Numar Telefon"></v-text-field>
          <v-text-field v-model="cititor.email" label="Email"></v-text-field>
        </v-card>
        <v-btn @click="salveazaCititor" color="green">Submit</v-btn>
      </v-form>
      <br>
      <br>
      <br>
      <v-data-table :headers="headers" :items="tabel">
      <template v-slot:item.actions="{item}">
      <v-icon @click="stergeCititor(item.raw.id)">mdi-delete
      </v-icon>
      </template>
      </v-data-table>
    </v-responsive>
  </v-container>
</template>

<script>
import CititorService from "@/service/CititorService";

export default {
  name: "Cititor",
  data(){
   return {
    cititor: {
      nume: null,
      prenume: null,
      adresa: null,
      nrTelefon: null,
      email: null
      },
    tabel: [{
      id:[],
      nume: [],
      prenume: [],
      adresa: [],
      nrTelefon: [],
      email: []
      }],
    headers: [
      {title: 'Id', key: 'id'},
      {title: 'Nume', key: 'nume'},
      {title: 'Prenume', key: 'prenume'},
      {title: 'Adresa', key: 'adresa'},
      {title: 'Numar Telefon', key: 'nrTelefon'},
      {title: 'Email', key: 'email'},
      {title: 'Actions', key: 'actions'}
      ],

     }
  },
  created(){
  this.getAllCititori();
  },

  methods: {
     salveazaCititor(){
        CititorService.postCititor(this.cititor)
     },
     stergeCititor(id){
        console.log("Hello")
        CititorService.deleteCititor(id)
     },
     getAllCititori(){
        CititorService.getAllCititori().then((response) => {
        this.tabel=response.data;
        })
     },
  },
}


</script>

<style scoped>

</style>
