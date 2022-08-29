module.exports = {
    env: {
        browser: true,
        es2021: true,
    },
    extends: [
        'plugin:react/recommended',
        'standard-with-typescript',
        'prettier',
    ],
    overrides: [],
    parserOptions: {
        ecmaVersion: 'latest',
        sourceType: 'module',
        project: [
            'tsconfig.json',
            // './Modulo2/mi-primera-app-con-typescript/tsconfig.json',
        ],
        tsconfigRootDir: __dirname,
    },
    plugins: ['react', '@typescript-eslint', 'prettier'],
    rules: {
        'no-console': 1,
        'no-extra-semi': 2,
        'react/prop-types': 0,
        // "indent": [1, "space"],
        'no-tabs': 0,
        // 'prettier/prettier': [
        //   'error',
        //   {
        //     trailingComma: 'all',
        //     tabWidth: 2,
        //     semi: false,
        //     singleQuote: true,
        //     bracketSpacing: true,
        //     eslintIntegration: true,
        //     printWidth: 60,
        //   },
        // ],

        // indent: ['error', 2]
    },
}
