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

    }
  },

  methods: {
    salveazaCarte(){
      CarteService.postCarte(this.carte)
    }
  },
}

</script>

<style scoped>

</style>

