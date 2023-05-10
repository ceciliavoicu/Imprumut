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
    </v-responsive>
  </v-container>
</template>

<script>
import CititorService from "@/service/CititorService";

export default{
  name:"Cititor",
  data(){
  return{
    cititor: {
      nume: null,
      prenume: null,
      adresa: null,
      nrTelefon: null,
      email: null
      },

     }
  },

  methods: {
     salveazaCititor(){
        CititorService.postCititor(this.cititor)
     }
  },
}

</script>

<style scoped>

</style>
