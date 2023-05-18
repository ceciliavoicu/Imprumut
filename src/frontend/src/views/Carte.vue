<template>
  <v-container>
    <v-responsive>
      <v-form>
        <v-card>
          <v-card-title>Carte</v-card-title>
          <v-text-field v-model="carte.nume" label="Nume"></v-text-field>
          <v-text-field v-model="carte.autor" label="Autor"></v-text-field>
          <v-text-field v-model="carte.editura" label="Editura"></v-text-field>
          <v-text-field v-model="carte.nrPagini" label="Numar Pagini"></v-text-field>
          <v-text-field v-model="carte.anulPublicarii" label="Anul Publicarii"></v-text-field>
        </v-card>
        <v-btn @click="salveazaCarte" color="green">Submit</v-btn>
      </v-form>
      <br>
      <br>
      <br>
      <v-data-table :headers="headers" :items="tabel">
      <template v-slot:item.actions="{item}">
      <v-icon @click="stergeCarte(item.raw.id)">mdi-delete
      </v-icon>
      </template>
      </v-data-table>
    </v-responsive>
  </v-container>
</template>

<script>
import CarteService from "@/service/CarteService";

export default {
  name: "Carte",
  data(){
    return {
      carte: {
        nume: null,
        autor: null,
        editura: null,
        nrPagini: null,
        anulPublicarii: null
      },
      tabel: [{
       id:[],
       nume: [],
       autor: [],
       editura: [],
       nrPagini: [],
       anulPublicarii: []
      }],
      headers: [
       {title: 'Id', key: 'id'},
       {title: 'Nume', key: 'nume'},
       {title: 'Autor', key: 'autor'},
       {title: 'Editura', key: 'editura'},
       {title: 'Numar Pagini', key: 'nrPagini'},
       {title: 'Anul Publicarii', key: 'anulPublicarii'},
       {title: 'Actions', key: 'actions'}
      ],
    }
  },
created(){
this.getAllCarti();
},

  methods: {
    salveazaCarte(){
      CarteService.postCarte(this.carte)
    },
    stergeCarti(id){
       console.log("Hello")
       CarteService.deleteCarte(id)
    },
    getAllCarti(){
     CarteService.getAllCarti().then((response) => {
     this.tabel=response.data;
     })
    },
  },
}

</script>

<style scoped>

</style>

