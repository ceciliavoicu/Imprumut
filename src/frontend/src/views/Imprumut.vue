<template>
  <v-container>
    <v-responsive>
      <v-form>
        <v-card>
          <v-card-title>Imprumut</v-card-title>
          <v-text-field v-model="imprumut.dataImprumut" label="Data Imprumut"></v-text-field>
          <v-text-field v-model="imprumut.dataReturnarii" label="Data Returnarii"></v-text-field>
          <v-text-field v-model="imprumut.status" label="Status"></v-text-field>
        </v-card>
        <v-btn @click="salveazaImprumut" color="green">Submit</v-btn>
      </v-form>
    </v-responsive>
  </v-container>
</template>

<script>
import ImprumutService from "@/service/ImprumutService";

export default {
 name: "Imprumut",
 data(){
    return {
      imprumut: {
      dataImprumut: null,
      dataReturnararii: null,
      status: null
      },

    }

 },

 methods: {
   salveazaImprumut(){
       ImprumutService.postImprumut(this.imprumut)
   }
 },
}
</script>

<style scoped>

</style>
