<template>
  <v-app>
    <v-navigation-drawer app>
      <v-list>
        <v-list-item title="Aplicatie imprumut" subtitle="Practica">
        </v-list-item>
        <v-divider>
        </v-divider>
        <v-list-item v-for="(page, index) in pagini"
                     :key="index" @click="goToPage(page.route)"
                     :title="page.name"
                     :prepend-icon="page.icon">
        </v-list-item>
      </v-list>
    </v-navigation-drawer>
    <v-main>
      <v-container fluid>
        <router-view></router-view>
      </v-container>
    </v-main>

  </v-app>
</template>

<script>
export default {
  data() {
    return {
      pagini: [
        {name: "Carte", route: "/carte", icon: "mdi-book-multiple"},
        {name: "Cititor", route: "/cititor", icon: "mdi-book-open"},
        {name: "Imprumut", route: "/imprumut", icon: "mdi-cash"},
        {name: "Student", route: "/student", icon: "mdi-account-school"}
      ]
    };
  },
  methods: {
    goToPage(route) {
      this.$router.push(route);
    }
  }
}

</script>
