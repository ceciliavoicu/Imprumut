<template>
  <v-container>
    <v-responsive>
      <v-form>
        <v-card>
          <v-card-title>Imprumut</v-card-title>
          <v-select :items="cititorImport" v-model="imprumut.cititor" label="Cititor" item-title="nume" item-value="id" return-object></v-select>
          <v-select :items="carteImport" v-model="imprumut.carte" label="Carte" item-title="nume" item-value="id" return-object></v-select>
          <Datepicker v-model="oldDateImprumut" :teleport="true" :enable-time-picker="false" auto-apply @update:model-value="changeDateImprumut">
          <template #trigger>
          <v-text-field v-model="imprumut.dataImprumut" label="Data imprumutarii" readonly @click="showCalendarImprumut=true">
          </v-text-field>
          </template>
          </Datepicker>
          <Datepicker v-model="oldDateReturn" :teleport="true" :enable-time-picker="false" auto-apply @update:model-value="changeDateReturnare">
          <template #trigger>
          <v-text-field v-model="imprumut.dataReturnarii" label="Data returnarii" readonly @click="showCalendarReturn=true">
          </v-text-field>
          </template>
          </Datepicker>
          <v-checkbox v-model="imprumut.status" label="Returnat">
          </v-checkbox>
        </v-card>
        <v-btn @click="salveazaImprumut" color="green">Submit</v-btn>
      </v-form>
      <br>
      <br>
      <br>
      <v-data-table :headers="headers" :items="imprumutImport">
      <template v-slot:item.actions="{item}">
      <v-icon @click="stergeImprumut(item.raw.id)">mdi-delete
      </v-icon>
      </template>
      </v-data-table>
    </v-responsive>
  </v-container>
</template>

<script>
import ImprumutService from "@/service/ImprumutService";
import CititorService from "@/service/CititorService";
import CarteService from "@/service/CarteService";
import Datepicker from '@vuepic/vue-datepicker'
import '@vuepic/vue-datepicker/dist/main.css'
export default {
components:{Datepicker},
  name: "Imprumut",
  data(){
    return {
    oldDateImprumut: null,
    oldDateReturn: null,
    showCalendarImprumut: false,
    showCalendarReturn: false,
    dateObtiuni: { year:"numeric", month:"2-digit", day:"2-digit"},
      imprumut: {
        carte: {
         id: null,
         nume: null,
         autor: null,
         editura: null,
         nrPagini: null,
         anulPublicarii: null
         },
         cititor: {
         id: null,
          nume: null,
          prenume: null,
          adresa: null,
          nrTelefon: null,
          email: null
          },
        dataImprumut: null,
        dataReturnarii: null,
        status: null
      },
      headers: [
        {title: 'Id', key: 'id'},
        {title: 'Cititor', key: 'cititor.nume'},
        {title: 'Carte', key: 'carte.nume'},
        {title: 'Data Imprumut', key: 'dataImprumut'},
        {title: 'Data Returnarii', key: 'dataReturnarii'},
        {title: 'Status', key: 'status'},
        {title: 'Actions', key: 'actions'}
      ],
      carteImport: [{
               id: [],
               nume: [],
               autor: [],
               editura: [],
               nrPagini: [],
               anulPublicarii: []
               }],
      cititorImport: [{
               id: [],
                nume: [],
                prenume: [],
                adresa: [],
                nrTelefon: [],
                email: []
                }],
      imprumutImport: [{
            carte: {
             id: [],
             nume: [],
             autor: [],
             editura: [],
             nrPagini: [],
             anulPublicarii: []
            },
          cititor: {
            id: [],
            nume: [],
            prenume: [],
            adresa: [],
            nrTelefon: [],
            email: []
          },
           dataImprumut: [],
           dataReturnarii: [],
           status: []
            }],
    }
  },
created(){
this.getAllImprumut();
this.getCititor();
this.getCarte();

},

  methods: {
    salveazaImprumut(){
      const [day, month, year]=this.imprumut.dataImprumut.split("/");
      this.imprumut.dataImprumut=new Date(`${year}-${month}-${day}`);
      const [days, months, years]=this.imprumut.dataReturnarii.split("/");
      this.imprumut.dataReturnarii=new Date(`${years}-${months}-${days}`);
      ImprumutService.postImprumut(this.imprumut)
    },
    stergeImprumut(id){
      console.log("Hello")
      ImprumutService.deleteImprumut(id)
    },
    getAllImprumut(){
     ImprumutService.getAllImprumut().then((response) => {
     this.imprumutImport=response.data;
     })
    },
    getCititor(){
    CititorService.getAllCititori().then((response) => {
    this.cititorImport=response.data;
    })
    },
    getCarte(){
    CarteService.getAllCarti().then((response) => {
    this.carteImport=response.data;
    })
    },
    changeDateImprumut(){
    this.imprumut.dataImprumut=this.oldDateImprumut.toLocaleDateString("en-GB", this.dateObtiuni)
    },
    changeDateReturnare(){
     this.imprumut.dataReturnarii=this.oldDateReturn.toLocaleDateString("en-GB", this.dateObtiuni)
    },
  },
}


</script>

<style scoped>

</style>
